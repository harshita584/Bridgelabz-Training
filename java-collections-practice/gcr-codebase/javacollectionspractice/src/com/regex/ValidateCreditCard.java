package com.regex;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String card = "4923456789012345";
        String regex = "^[4-5][0-9]{15}$";

        System.out.println(card.matches(regex));
    }
}
