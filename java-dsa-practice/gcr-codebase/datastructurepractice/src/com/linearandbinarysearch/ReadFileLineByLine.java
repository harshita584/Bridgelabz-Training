package com.linearandbinarysearch;

import java.io.*;

public class ReadFileLineByLine {

    public static void main(String[] args) {

        try {
            // create FileReader object
            FileReader fr = new FileReader("sample.txt");

            // wrap with BufferedReader for efficient reading
            BufferedReader br = new BufferedReader(fr);

            String line;

            // read and print each line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // close resources
            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
