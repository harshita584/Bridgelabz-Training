package com.csvdatahandling;

import java.io.*;
import java.util.*;
import org.json.*;

public class JsonCsvConverter {

    public static void jsonToCsv(String jsonFile, String csvFile) {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader br = new BufferedReader(new FileReader(jsonFile));
            String line;
            while ((line = br.readLine()) != null) sb.append(line);
            br.close();

            JSONArray arr = new JSONArray(sb.toString());
            if (arr.length() == 0) return;

            JSONObject first = arr.getJSONObject(0);
            List<String> headers = new ArrayList<>(first.keySet());

            BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile));
            bw.write(String.join(",", headers));
            bw.newLine();

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);
                List<String> row = new ArrayList<>();
                
                for (String h : headers) row.add(obj.get(h).toString());
                bw.write(String.join(",", row));
                bw.newLine();
            }
            bw.close();
            System.out.println("JSON to CSV done");

        } 
        catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void csvToJson(String csvFile, String jsonFile) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(csvFile));
            String[] headers = br.readLine().split(",");
            JSONArray arr = new JSONArray();

            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                JSONObject obj = new JSONObject();
                for (int i = 0; i < headers.length; i++) {
                    obj.put(headers[i], values[i]);
                }
                arr.put(obj);
            }
            br.close();

            BufferedWriter bw = new BufferedWriter(new FileWriter(jsonFile));
            bw.write(arr.toString());
            bw.close();

            System.out.println("CSV to JSON done");

        } 
        catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        jsonToCsv("students.json", "students.csv");
        csvToJson("students.csv", "students2.json");
    }
}
