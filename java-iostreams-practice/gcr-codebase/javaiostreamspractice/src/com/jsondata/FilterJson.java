package com.jsondata;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class FilterJson {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("users.json"))) {
            StringBuilder sb = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            JSONArray input = new JSONArray(sb.toString());
            JSONArray result = new JSONArray();

            for (int i = 0; i < input.length(); i++) {
                JSONObject user = input.getJSONObject(i);

                if (user.getInt("age") > 25) {
                    result.put(user);
                }
            }

            System.out.println(result.toString());

        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
