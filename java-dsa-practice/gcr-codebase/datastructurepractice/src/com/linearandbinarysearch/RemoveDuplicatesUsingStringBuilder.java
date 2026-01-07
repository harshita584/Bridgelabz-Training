package com.linearandbinarysearch;

import java.util.HashSet;

class RemoveDuplicatesUsingStringBuilder {

    public static void main(String[] args) {

        String input = "programming";

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        // iterate through each character
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // check if character is already present
            if (!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }

        String result = sb.toString();

        // display output
        System.out.println("Original String: " + input);
        System.out.println("String without duplicates: " + result);
    }
}


