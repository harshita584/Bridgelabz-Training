package com.jsondata;

import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadJSONFields {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("users.json")) {

            JSONTokener tokener = new JSONTokener(reader);
            JSONArray arr = new JSONArray(tokener);

            for (int i = 0; i < arr.length(); i++) {

                JSONObject obj = arr.getJSONObject(i);
                
                String name = obj.getString("name");
                String email = obj.getString("email");
                int age = obj.getInt("age");

                System.out.println(name + " " + email + " " + age);
            }

        } catch (Exception e) {
            System.out.println("JSON read error");
        }
    }
}
