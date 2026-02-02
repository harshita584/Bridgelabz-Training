package com.csvdatahandling;

import java.io.*;

public class ReadLargeCSV {
    public static void main(String[] args) {
        int batchSize = 100;
        int batchCount = 0;
        int totalCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("large.csv"))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                batchCount++;
                totalCount++;

                if (batchCount == batchSize) {
                    System.out.println("Processed records: " + totalCount);
                    batchCount = 0;
                }
            }

            if (batchCount > 0) {
                System.out.println("Processed records: " + totalCount);
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

