package com.linearandbinarysearch;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CompareStringAndFileIO {

    public static void main(String[] args) {

        int n = 1000000; // number of concatenations
        String str = "hello";

        // Compare StringBuilder vs StringBuffer
        // StringBuilder test
        StringBuilder sb = new StringBuilder();
        long startSB = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        long endSB = System.nanoTime();
        long timeSB = endSB - startSB;

        // StringBuffer test
        StringBuffer sbuf = new StringBuffer();
        long startSBUF = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbuf.append(str);
        }
        long endSBUF = System.nanoTime();
        long timeSBUF = endSBUF - startSBUF;

        System.out.println("StringBuilder time: " + timeSB + " ns");
        System.out.println("StringBuffer time: " + timeSBUF + " ns");

        // Compare FileReader vs InputStreamReader
        String fileName = "largefile.txt"; // assume 100MB file exists

        // FileReader test
        long wordCountFR = 0;
        long startFR = System.nanoTime();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountFR += words.length;
            }
        } catch (IOException e) {
            System.out.println("FileReader error: " + e.getMessage());
        }
        long endFR = System.nanoTime();
        long timeFR = endFR - startFR;

        // InputStreamReader test
        long wordCountISR = 0;
        long startISR = System.nanoTime();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCountISR += words.length;
            }
        } catch (IOException e) {
            System.out.println("InputStreamReader error: " + e.getMessage());
        }
        long endISR = System.nanoTime();
        long timeISR = endISR - startISR;

        // Display results
        System.out.println("\nFileReader word count: " + wordCountFR + " | Time: " + timeFR + " ns");
        System.out.println("InputStreamReader word count: " + wordCountISR + " | Time: " + timeISR + " ns");
    }
}
