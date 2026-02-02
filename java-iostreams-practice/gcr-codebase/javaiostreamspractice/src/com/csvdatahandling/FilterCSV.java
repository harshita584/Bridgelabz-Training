package com.csvdatahandling;

import java.io.*;

public class FilterCSV {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("student.csv"))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");

                int marks = Integer.parseInt(student[3]);

                if (marks > 80) {
                    System.out.println(student[0] + " " + student[1] + " " + student[2] + " " + student[3]);
                }
            }
        } 
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
    }
}
