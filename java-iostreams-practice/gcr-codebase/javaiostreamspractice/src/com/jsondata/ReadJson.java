package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class ReadJson {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("users.json"))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            JSONArray arr = new JSONArray(sb.toString());

            for (int i = 0; i < arr.length(); i++) {
                JSONObject obj = arr.getJSONObject(i);

                for (String key : obj.keySet()) {
                    System.out.println(key + " : " + obj.get(key));
                }
                System.out.println();
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
