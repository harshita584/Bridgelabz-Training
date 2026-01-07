package com.linearandbinarysearch;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class InputStreamReaderExample {

    public static void main(String[] args) {

        String fileName = "sample.txt"; // file with UTF-8 encoded data

        try {
            // create FileInputStream to read bytes
            FileInputStream fis = new FileInputStream(fileName);

            // wrap FileInputStream with InputStreamReader to convert bytes to characters
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

            // wrap with BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(isr);

            String line;

            // read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // close resources
            br.close();
            isr.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
