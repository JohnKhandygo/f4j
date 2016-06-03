package com.kspt.khandygo.formatting;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.Accessors;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

@AllArgsConstructor
@Accessors(fluent = true)
@Getter
@EqualsAndHashCode
@ToString
public class FormattingRule {

  private static final String DEFAULT_FORMAT = "%s";

  private final FormattingContext context;

  private final List<FormattingPremise> premises;

  private final Map<String, Integer> formats;

  public String format() {
    return formats.entrySet().stream()
        .max(Comparator.comparingInt(Entry::getValue))
        .map(Entry::getKey)
        .orElseGet(() -> DEFAULT_FORMAT);
  }

  public FormattingRule merge(final FormattingRule other) {
    Preconditions.checkState(applicableTo(other.context, other.premises));
    final Map<String, Integer> mergedFormats = Maps.newHashMap(formats);
    other.formats.entrySet().stream()
        .forEach(e -> mergedFormats.merge(e.getKey(), e.getValue(), (i1, i2) -> i1 + i2));
    return new FormattingRule(context, premises, mergedFormats);
  }

  public boolean applicableTo(
      final FormattingContext otherContext,
      final List<FormattingPremise> otherPremises) {
    if (!Objects.equals(context, otherContext)) return false;
    if (!Objects.equals(premises, otherPremises)) return false;
    return true;
  }
}
