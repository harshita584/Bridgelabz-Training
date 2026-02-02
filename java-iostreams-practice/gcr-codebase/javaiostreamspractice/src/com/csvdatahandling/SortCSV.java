package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class SortCSV {
    public static void main(String[] args) {
        List<String[]> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("employees.csv"))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                list.add(line.split(","));
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Collections.sort(list, (a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

        for(int i = 0; i < Math.min(5, list.size()); i++) System.out.println(Arrays.toString(list.get(i)));
    }
}
