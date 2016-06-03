package com.kspt.khandygo.antlr;

import com.kspt.khandygo.formatting.FormattingPremise;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.antlr.v4.runtime.tree.ParseTree;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class AntlrFormattingPremise implements FormattingPremise {

  private final Class<? extends ParseTree> premiseClass;
}
