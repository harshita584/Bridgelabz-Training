package com.functionalinterfaces.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Formatter {
    static String format(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}
