package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) {
        Map<String, String[]> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students1.csv"))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                map.put(student[0], new String[]{student[1], student[2]}); 
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (
            BufferedReader br = new BufferedReader(new FileReader("students2.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mergestudents.csv"))
        ) {

            bw.write("ID,Name,Age,Marks,Grade");
            bw.newLine();

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");
                String id = student[0];

                if (map.containsKey(id)) {
                    String[] info = map.get(id);

                    bw.write(id + "," + info[0] + "," + info[1] + "," + student[1] + "," + student[2]);
                    bw.newLine();
                }
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
