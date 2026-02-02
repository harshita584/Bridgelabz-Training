package com.csvdatahandling;

import java.io.*;

public class CountCSVRows {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            br.readLine();
            while (br.readLine() != null) {
                count++;
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Total Records: " + count);
    }
}
