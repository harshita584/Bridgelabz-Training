package com.jsondata;

import org.json.JSONObject;

public class MergeJSON {
    public static void main(String[] args) {
        JSONObject json1 = new JSONObject();
        json1.put("name", "name1");
        json1.put("age", 20);

        JSONObject json2 = new JSONObject();
        json2.put("email", "mail1@test.com");
        json2.put("city", "city1");

        for (String key : json2.keySet()) {
            json1.put(key, json2.get(key));
        }

        System.out.println(json1.toString());
    }
}

