package com.linearandbinarysearch;

public class ConcatenateStringsUsingStringBuffer {

    public static void main(String[] args) {

        String[] words = {"Java", " ", "is", " ", "easy"};

        // create StringBuffer object
        StringBuffer sb = new StringBuffer();

        // append each string to StringBuffer
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
        }

        // convert to String
        String result = sb.toString();

        // display output
        System.out.println("Concatenated String: " + result);
    }
}
