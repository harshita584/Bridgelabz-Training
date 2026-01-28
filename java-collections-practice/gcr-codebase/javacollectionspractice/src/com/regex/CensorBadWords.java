package com.regex;

public class CensorBadWords {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";
        String output = input.replaceAll("\\b(damn|stupid)\\b", "****");
        System.out.println(output);
    }
}
