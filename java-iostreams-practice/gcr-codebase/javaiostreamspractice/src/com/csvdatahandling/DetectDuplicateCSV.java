package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class DetectDuplicateCSV {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            br.readLine();
            
            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");

                String id = student[0];
                
                if(set.contains(id))System.out.println("Duplicate Record -> " + line);
                else set.add(id);
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
