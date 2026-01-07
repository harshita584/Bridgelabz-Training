package com.linearandbinarysearch;

public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        String input = "hello";

        // create StringBuilder object
        StringBuilder sb = new StringBuilder();

        // append the string
        sb.append(input);

        // reverse the string
        sb.reverse();

        // convert to String
        String output = sb.toString();

        // display result
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + output);
    }
}

