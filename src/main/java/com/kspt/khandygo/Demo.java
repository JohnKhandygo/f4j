package com.kspt.khandygo;

import com.google.common.io.Resources;
import com.kspt.khandygo.antlr.generated.JavaLexer;
import com.kspt.khandygo.antlr.generated.JavaParser;
import com.kspt.khandygo.formatting.FormattingRule;
import com.kspt.khandygo.processing.FormattingRulesApplier;
import com.kspt.khandygo.processing.FormattingRulesMiner;
import javafx.util.Pair;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

public class Demo {

  public static void main(String[] args)
  throws Exception {

    JavaLexer trainLexer = buildLexerOn("train");
    final CommonTokenStream trainTokens = new CommonTokenStream(trainLexer);
    JavaParser trainParser = new JavaParser(trainTokens);
    ParseTree trainTree = trainParser.compilationUnit();
    final List<FormattingRule> rules = new FormattingRulesMiner(trainTokens).visit(trainTree);

    System.out.format("discover %d rule.%n", rules.size());
    for (int i = 0; i < rules.size(); ++i) {
      final FormattingRule rule = rules.get(i);
      System.out.format("%d:%n", i);
      System.out.format("\tcontext:%s%n", rule.context());
      System.out.format("\tpremises:%n");
      for (int j = 0; j < rule.premises().size(); ++j) {
        System.out.format("\t\tpremise %d:%s%n", j, rule.premises().get(j));
      }

      System.out.format("\tformats:%n");
      rule.formats().entrySet().stream()
          .forEach(e -> System.out.format("\t\t%d: %s%n", e.getValue(), e.getKey()));
      System.out.println();
    }

    JavaLexer testLexer = buildLexerOn("test");
    final CommonTokenStream testTokens = new CommonTokenStream(testLexer);
    JavaParser testParser = new JavaParser(testTokens);
    ParseTree testTree = testParser.compilationUnit();
    final FormattingRulesApplier applier = FormattingRulesApplier.newOne(testTokens, rules);
    applier.visit(testTree);
    final List<Pair<String, String>> texts = applier.texts();
    texts.stream().forEach(p -> {
      System.out.print(p.getKey());
      System.out.print(p.getValue());
    });

    final int a = 0;
  }

  private static JavaLexer buildLexerOn(final String fileName)
  throws URISyntaxException, IOException {
    final URL url = Resources.getResource(fileName);
    final File file = new File(url.toURI());
    return new JavaLexer(new ANTLRInputStream(new FileInputStream(file)));
  }
}
