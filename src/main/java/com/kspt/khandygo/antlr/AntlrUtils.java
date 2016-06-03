package com.kspt.khandygo.antlr;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.Objects;

public class AntlrUtils {

  public static boolean homogeneousContext(final ParserRuleContext context) {
    if (context instanceof TerminalNode) {
      return false;
    } else if (context.children == null) {
      return false;
    } else if (context.children.size() < 2) {
      return false;
    } else {
      final Class<? extends ParseTree> firstChildClass = context.children.get(0).getClass();
      for (int i = 1; i < context.children.size(); ++i) {
        if (!Objects.equals(firstChildClass, context.children.get(i).getClass())) {
          return false;
        }
      }
    }
    return true;
  }
}
