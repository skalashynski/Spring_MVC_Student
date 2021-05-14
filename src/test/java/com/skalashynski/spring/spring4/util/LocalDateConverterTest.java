package com.skalashynski.spring.spring4.util;

import org.junit.Test;

import java.time.LocalDate;

public class LocalDateConverterTest {
    private LocalDate localDate;

    @Test
    public void test() {
        System.out.println(LocalDate.parse("2010-01-12"));
    }
}
