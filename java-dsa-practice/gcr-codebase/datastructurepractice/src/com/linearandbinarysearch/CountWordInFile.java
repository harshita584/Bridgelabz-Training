package com.linearandbinarysearch;

import java.io.*;

public class CountWordInFile {

    public static void main(String[] args) {

        String fileName = "sample.txt";
        String targetWord = "java"; // word to count
        int count = 0;

        try {
            // create FileReader and wrap with BufferedReader
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;

            // read file line by line
            while ((line = br.readLine()) != null) {

                // split line into words
                String[] words = line.split("\\s+");

                // check each word
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            // close resources
            br.close();
            fr.close();

            // display result
            System.out.println("The word \"" + targetWord + "\" appears " + count + " times in the file.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
