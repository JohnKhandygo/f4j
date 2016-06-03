package com.kspt.khandygo.antlr;

import com.kspt.khandygo.formatting.FormattingContext;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.antlr.v4.runtime.ParserRuleContext;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public abstract class AntlrFormattingContext implements FormattingContext {

  private final Class<? extends ParserRuleContext> contextClass;

  @EqualsAndHashCode(callSuper = true)
  @ToString(callSuper = true)
  public static class AntlrHomogeneousFormattingContext
      extends AntlrFormattingContext
      implements HomogeneousFormattingContext {
    public AntlrHomogeneousFormattingContext(final Class<? extends ParserRuleContext> contextClass) {
      super(contextClass);
    }
  }

  @EqualsAndHashCode(callSuper = true)
  @ToString(callSuper = true)
  public static class AntlrHeterogeneousFormattingContext
      extends AntlrFormattingContext
      implements HeterogeneousFormattingContext {
    public AntlrHeterogeneousFormattingContext(final Class<? extends ParserRuleContext> contextClass) {
      super(contextClass);
    }
  }
}
