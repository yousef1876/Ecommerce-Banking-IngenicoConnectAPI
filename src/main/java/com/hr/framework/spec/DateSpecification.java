package com.hr.framework.spec;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import net.kaczmarzyk.spring.data.jpa.domain.PathSpecification;
import net.kaczmarzyk.spring.data.jpa.utils.Converter;


abstract class DateSpecification<T> extends PathSpecification<T> {

  protected Converter converter;

  protected DateSpecification(String path, String[] args, Converter converter)
      throws ParseException {
    super(path);
    this.converter = converter;
  }

  protected LocalDateTime covertToLocalDateTime(String value) {
    try {
      return LocalDateTime
          .ofInstant(Instant.ofEpochMilli(Long.valueOf(value)), ZoneId.systemDefault());
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException("invalid date, expected timestamp ");
    }
  }
}
