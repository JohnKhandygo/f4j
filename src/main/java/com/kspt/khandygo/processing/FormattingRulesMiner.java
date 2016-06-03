package com.kspt.khandygo.processing;

import com.google.common.base.Verify;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.kspt.khandygo.antlr.AntlrFormattingContext.AntlrHeterogeneousFormattingContext;
import com.kspt.khandygo.antlr.AntlrFormattingContext.AntlrHomogeneousFormattingContext;
import com.kspt.khandygo.antlr.AntlrFormattingPremise;
import static com.kspt.khandygo.antlr.AntlrUtils.homogeneousContext;
import com.kspt.khandygo.antlr.generated.JavaLexer;
import com.kspt.khandygo.formatting.FormattingContext;
import com.kspt.khandygo.formatting.FormattingPremise;
import com.kspt.khandygo.formatting.FormattingRule;
import static java.lang.String.format;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class FormattingRulesMiner extends AbstractParseTreeVisitor<List<FormattingRule>> {

  private final CommonTokenStream tokensStream;

  @Override
  public List<FormattingRule> visitChildren(final RuleNode node) {
    List<FormattingRule> thisNodeRules = defaultResult();
    if (node instanceof ParserRuleContext) {
      final FormattingRule rule = extractFormattingFromContext((ParserRuleContext) node);
      thisNodeRules.add(rule);
    }

    int n = node.getChildCount();
    for (int i = 0; i < n; ++i) {
      ParseTree child = node.getChild(i);
      /*if (child == null) {
        continue;
      }*/
      if (child instanceof ParserRuleContext) {
        /*if (children((ParserRuleContext) child).isEmpty()) continue;*/
        final List<FormattingRule> childRules = visitChildren((ParserRuleContext) child);
        thisNodeRules = aggregateResult(thisNodeRules, childRules);
      }
    }

    return thisNodeRules;
  }

  private FormattingRule extractFormattingFromContext(final ParserRuleContext context) {
    final FormattingContext formattingContext;
    final Map<String, Integer> formatsRates;
    final List<FormattingPremise> premises;
    //final List<ParseTree> children = children(context);
    final List<ParseTree> children = context.children;
    if (homogeneousContext(context)) {
      formatsRates = extractFormatForHomogeneousContext(context);
      formattingContext = new AntlrHomogeneousFormattingContext(context.getClass());
      final FormattingPremise theOnlyPremise =
          new AntlrFormattingPremise(children.get(0).getClass());
      premises = singletonList(theOnlyPremise);
    } else {
      final String format = extractFormatForHeterogeneousContext(context);
      formatsRates = Maps.newHashMap();
      formatsRates.put(format, 1);
      formattingContext = new AntlrHeterogeneousFormattingContext(context.getClass());
      premises = children.stream()
          .map(child -> new AntlrFormattingPremise(child.getClass()))
          .collect(toList());
    }
    return new FormattingRule(formattingContext, premises, formatsRates);
  }

  private Map<String, Integer> extractFormatForHomogeneousContext(final ParserRuleContext context) {
    final Map<String, Integer> formatsRates = Maps.newHashMap();

    int lastObservedTokenIndex = context.getStart().getTokenIndex();
    int lineShift = findLineShiftFrom(lastObservedTokenIndex);

    //final List<ParseTree> children = children(context);
    final List<ParseTree> children = context.children;
    for (int i = 0; i < children.size() - 1; ++i) {

      final ParseTree currentChild = children.get(i);
      final ParseTree nextChild = children.get(i + 1);

      final int currentChildStopTokenIndex;
      if (currentChild instanceof ParserRuleContext) {
        currentChildStopTokenIndex = ((ParserRuleContext) currentChild).getStop().getTokenIndex();
      } else {
        currentChildStopTokenIndex = lastObservedTokenIndex;
      }

      final int nextChildStartTokenIndex =
          findStartingTokenIndex(nextChild, currentChildStopTokenIndex);

      final String formattingBetweenPair =
          extractFormattingBetween(
              currentChildStopTokenIndex,
              nextChildStartTokenIndex,
              lineShift);

      formatsRates.compute("%s" + formattingBetweenPair, (k, v) -> v == null ? 1 : v + 1);
    }

    return formatsRates;
  }

  private String extractFormatForHeterogeneousContext(final ParserRuleContext context) {
    String format = "%s";

    int lastObservedTokenIndex = context.getStart().getTokenIndex();
    final int lineShift = findLineShiftFrom(lastObservedTokenIndex);

    //final List<ParseTree> children = children(context);
    final List<ParseTree> children = context.children;
    for (int i = 1; i < children.size(); ++i) {
      final ParseTree currentChild = children.get(i);

      final ParseTree previousChild = children.get(i - 1);
      if (previousChild instanceof ParserRuleContext) {
        try {
          lastObservedTokenIndex = ((ParserRuleContext) previousChild).getStop().getTokenIndex();
        } catch (Exception any) {
          final int a = 1;
        }
      }

      final int currentTokenIndex = findStartingTokenIndex(currentChild, lastObservedTokenIndex);
      String formattingAfterToken =
          extractFormattingBetween(lastObservedTokenIndex, currentTokenIndex, lineShift);

      format += formattingAfterToken + "%s";
      lastObservedTokenIndex = currentTokenIndex;
    }

    return format;
  }

  private String extractFormattingBetween(
      final int startIndex,
      final int stopIndex,
      final int lineShift) {
    boolean newLine = false;
    String formatting = "";
    for (int j = startIndex + 1; j < stopIndex; ++j) {
      final Token formattingToken = tokensStream.get(j);
      if (formattingToken.getType() == JavaLexer.NLS) {
        newLine = true;
      } else if (formattingToken.getType() == JavaLexer.SS) {
        if (newLine) {
          j += lineShift - 1;
          newLine = false;
          Verify.verify(
              j <= stopIndex,
              "cannot parse format because of unexpected line shift.");
          continue;
        }
      }
      formatting += formattingToken.getText();
    }
    return formatting;
  }

  private int findStartingTokenIndex(final ParseTree tree, final int from) {
    if (tree instanceof ParserRuleContext) {
      return ((ParserRuleContext) tree).getStart().getTokenIndex();
    } else if (tree instanceof TerminalNode) {
      int index = from + 1;
      final String currentChildText = tree.getText();
      while (!Objects.equals(tokensStream.get(index).getText(), currentChildText)) {
        index += 1;
      }
      return index;
    } else {
      throw new RuntimeException(
          format(
              "cannot find starting token for child %s",
              tree));
    }
  }

  private int findLineShiftFrom(final int fromTokenIndex) {
    int lineShift = 0;
    for (int i = fromTokenIndex; i >= 0; --i) {
      if (tokensStream.get(i).getType() == JavaLexer.NLS) {
        Token lastNonFormatAfterNLS = this.tokensStream.get(i + 1);
        while (lastNonFormatAfterNLS.getType() == JavaLexer.SS) {
          lastNonFormatAfterNLS = tokensStream.get(lastNonFormatAfterNLS.getTokenIndex() + 1);
        }
        lineShift = lastNonFormatAfterNLS.getTokenIndex() - i - 1;
        break;
      }
    }
    return lineShift;
  }

  @Override
  protected List<FormattingRule> defaultResult() {
    return Lists.newArrayList();
  }

  @Override
  protected List<FormattingRule> aggregateResult(
      final List<FormattingRule> aggregated,
      final List<FormattingRule> nextResult) {
    final List<FormattingRule> result = Lists.newArrayList(aggregated);
    for (final FormattingRule childRule : nextResult) {
      FormattingRule toInsert = childRule;
      final Iterator<FormattingRule> it = result.iterator();
      while (it.hasNext()) {
        final FormattingRule next = it.next();
        if (next.applicableTo(toInsert.context(), toInsert.premises())) {
          it.remove();
          toInsert = next.merge(toInsert);
          break;
        }
      }
      result.add(toInsert);
    }
    return result;
  }
}
