package com.functionalinterfaces;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> length = String::length;
        System.out.println(length.apply("Message Length"));
    }
}
