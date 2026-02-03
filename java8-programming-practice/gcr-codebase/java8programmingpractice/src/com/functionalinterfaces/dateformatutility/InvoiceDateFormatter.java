package com.functionalinterfaces.dateformatutility;

import java.time.LocalDate;

public class InvoiceDateFormatter {
    public static void main(String[] args) {
        System.out.println(Formatter.format(LocalDate.now(), "dd-MM-yyyy"));
        System.out.println(Formatter.format(LocalDate.now(), "yyyy/MM/dd"));
    }
}

