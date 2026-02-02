package com.csvdatahandling;

import java.io.*;

public class SearchCSV {
    public static void main(String[] args) {
        String searchName = "name3";
        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] employee = line.split(",");

                if (employee[1].equalsIgnoreCase(searchName)) {
                    System.out.println(employee[0] + " " + employee[1] + " " + employee[2] + " " + employee[3]);
                    return;
                }
            }

            System.out.println("Employee not found");

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

