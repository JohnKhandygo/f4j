package com.kspt.khandygo.processing;

import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.kspt.khandygo.antlr.AntlrFormattingContext.AntlrHeterogeneousFormattingContext;
import com.kspt.khandygo.antlr.AntlrFormattingContext.AntlrHomogeneousFormattingContext;
import com.kspt.khandygo.antlr.AntlrFormattingPremise;
import static com.kspt.khandygo.antlr.AntlrUtils.homogeneousContext;
import com.kspt.khandygo.antlr.generated.JavaLexer;
import com.kspt.khandygo.formatting.FormattingContext;
import com.kspt.khandygo.formatting.FormattingPremise;
import com.kspt.khandygo.formatting.FormattingRule;
import static java.util.Collections.singletonList;
import static java.util.stream.Collectors.toList;
import javafx.util.Pair;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Accessors(fluent = true)
@Getter
public class FormattingRulesApplier extends AbstractParseTreeVisitor<Void> {

  private final CommonTokenStream tokens;

  private final List<Pair<String, String>> texts;

  private final List<FormattingRule> rules;

  int lineShift;

  @Override
  public Void visitChildren(final RuleNode node) {
    if (node instanceof ParserRuleContext) {
      applyFormatFor((ParserRuleContext) node);
    }
    return null;
  }

  private void applyFormatFor(final ParserRuleContext context) {
    final String formatting = findFormatting(context);

    /*System.out.format("observe %s: %s.%n",
        context.getClass().getSimpleName(),
        context.getText());
    System.out.format("found format %s.%n", formatting);*/

    final List<String> formats = Splitter.on("%s").splitToList(formatting);
    //final List<ParseTree> children = children(context);
    final List<ParseTree> children = context.children;
    final String[] eachFormatting = new String[children.size()];
    for (int i = 0; i < children.size(); ++i) {
      eachFormatting[i] = formats.get(i);
    }

    int currentTokenIndex = context.getStart().getTokenIndex();
    for (int i = 0; i < eachFormatting.length; ++i) {
      final String currentFormat = eachFormatting[i];
      final ParseTree subTree = children.get(i);

      currentTokenIndex = findStartOf(subTree, currentTokenIndex);

      final int additionalShift = computeAdditionalLineShift(currentFormat);
      final Pair<String, String> formatPair = texts.get(currentTokenIndex);
      final String newFormat;
      if (currentFormat.startsWith("\n")) {
        newFormat = currentFormat + formatForLineShift(lineShift) + formatPair.getKey();
      } else {
        newFormat = currentFormat + formatPair.getKey();
      }
      final Pair<String, String> newFormatPair = new Pair<>(newFormat, formatPair.getValue());
      texts.set(currentTokenIndex, newFormatPair);

      if (subTree instanceof ParserRuleContext) {
        lineShift += additionalShift;
        visitChildren((ParserRuleContext) subTree);
        lineShift -= additionalShift;
        currentTokenIndex = ((ParserRuleContext) subTree).getStop().getTokenIndex() + 1;
      } else {
        currentTokenIndex += 1;
      }
    }
  }

  private int computeAdditionalLineShift(final String currentFormat) {
    final int additionalShift;
    if (currentFormat.startsWith("\n")) {
      String temp = currentFormat.substring(1);
      while (temp.startsWith("\n")) {
        if (temp.length() > 1) {
          temp = temp.substring(1);
        } else {
          temp = "";
          break;
        }
      }
      additionalShift = temp.length();
    } else {
      additionalShift = 0;
    }
    return additionalShift;
  }

  private String formatForLineShift(final int shift) {
    return repeatFormat(" ", shift);
  }

  private String repeatFormat(final String format, final int count) {
    String result = "";
    for (int i = 0; i < count; ++i) {
      result += format;
    }
    return result;
  }

  private int findStartOf(final ParseTree subTree, final int start) {
    int index = start;
    if (subTree instanceof TerminalNode) {
      Token instance = tokens.get(index);
      final String subTreeText = subTree.getText();
      while (!Objects.equals(instance.getText(), subTreeText)) {
        instance = tokens.get(++index);
      }
    } else if (subTree instanceof ParserRuleContext) {
      index = ((ParserRuleContext) subTree).getStart().getTokenIndex();
    }
    return index;
  }

  private String findFormatting(final ParserRuleContext context) {
    final List<FormattingRule> applicableRules = findApplicableRules(context);
    return extractFormatForContext(context, applicableRules);
  }

  private String extractFormatForContext(
      final ParserRuleContext context,
      final List<FormattingRule> applicableRules) {
    if (applicableRules.isEmpty()) {
      return defaultFormatForNPremises(context.children.size());
    }
    final String rawFormat = applicableRules.get(0).format();
    if (homogeneousContext(context)) {
      Preconditions.checkState(rawFormat.startsWith("%s"));
      final String format = repeatFormat(rawFormat, context.children.size());
      final int oneFormatLength = rawFormat.length() - 2;
      return format.substring(0, format.length() - oneFormatLength);
    }
    return rawFormat;
  }

  private String defaultFormatForNPremises(final int n) {
    final String raw = repeatFormat("%s ", n);
    return raw.substring(0, raw.length() - 1);
  }

  private List<FormattingRule> findApplicableRules(final ParserRuleContext context) {
    final FormattingContext formattingContext;
    final List<FormattingPremise> premises;
    if (homogeneousContext(context)) {
      formattingContext = new AntlrHomogeneousFormattingContext(context.getClass());
      premises = singletonList(new AntlrFormattingPremise(context.children.get(0).getClass()));
    } else {
      formattingContext = new AntlrHeterogeneousFormattingContext(context.getClass());
      premises = context.children.stream()
          .map(child -> new AntlrFormattingPremise(child.getClass()))
          .collect(Collectors.toList());
    }

    return rules.stream()
        .filter(r -> r.applicableTo(formattingContext, premises))
        .collect(toList());
  }

  public static FormattingRulesApplier newOne(
      final CommonTokenStream tokens,
      final List<FormattingRule> rules) {
    final List<Pair<String, String>> texts = tokens.getTokens().stream()
        .map(t ->
            new Pair<>(
                "",
                (t.getType() == JavaLexer.NLS || t.getType() == JavaLexer.SS) ? "" : t.getText()))
        .collect(toList());
    return new FormattingRulesApplier(tokens, texts, rules, 0);
  }
}
