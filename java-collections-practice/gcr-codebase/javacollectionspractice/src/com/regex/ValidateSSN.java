package com.regex;

public class ValidateSSN {
    public static void main(String[] args) {
        String ssn = "123-45-6789";
        String regex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
        System.out.println(ssn.matches(regex));
    }
}
