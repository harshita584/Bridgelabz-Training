package com.jsondata;

import org.json.JSONObject;
import org.json.XML;

public class ConvertJsonToXML {
    public static void main(String[] args) {
        String json = """
        {
          "student": {
            "name": "Rahul",
            "age": 22,
            "course": "Java"
          }
        }
        """;

        JSONObject jsonObject = new JSONObject(json);
        String xml = XML.toString(jsonObject);
        System.out.println(xml);
    }
}
