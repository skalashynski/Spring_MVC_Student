package com.artsoft.util;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDate;

@Converter(autoApply = true)
public class LocalDateToStringConverter implements AttributeConverter<LocalDate, String> {
    @Override
    public String convertToDatabaseColumn(LocalDate date) {
        return date.toString();
    }

    @Override
    public LocalDate convertToEntityAttribute(String s) {
        return LocalDate.parse(s);
    }
}
