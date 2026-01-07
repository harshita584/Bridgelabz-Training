package com.linearandbinarysearch;

public class SearchSentenceLinear {

    // method to find the first sentence containing the word
    static String findSentence(String[] sentences, String word) {

        for (int i = 0; i < sentences.length; i++) {
            if (sentences[i].contains(word)) { // check if sentence contains the word
                return sentences[i];
            }
        }

        return "Not Found"; // word not found in any sentence
    }

    public static void main(String[] args) {

        String[] sentences = {
            "Java is easy to learn",
            "Linear Search is simple",
            "Data Structures are important",
            "Practice makes perfect"
        };

        String wordToFind = "Linear";

        String result = findSentence(sentences, wordToFind);

        System.out.println("Search result: " + result);
    }
}
