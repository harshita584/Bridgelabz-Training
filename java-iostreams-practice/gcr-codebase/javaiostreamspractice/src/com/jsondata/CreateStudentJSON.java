package com.jsondata;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateStudentJSON {
    public static void main(String[] args) {
        JSONObject student = new JSONObject();

        student.put("name", "name");
        student.put("age", 20);

        JSONArray subjects = new JSONArray();
        subjects.put("sub1");
        subjects.put("sub2");
        subjects.put("sub3");

        student.put("subjects", subjects);

        System.out.println(student.toString());
    }
}

