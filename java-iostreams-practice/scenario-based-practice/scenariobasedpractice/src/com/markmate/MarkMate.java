package com.markmate;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONArray;
import org.json.JSONObject;

public class MarkMate {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("marks.csv"))) {
            JSONArray result = new JSONArray();
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                
                String name = data[0];
                int math = Integer.parseInt(data[1]);
                int science = Integer.parseInt(data[2]);
                int english = Integer.parseInt(data[3]);

                int total = math + science + english;
                double average = total / 3.0;

                String grade;
                
                if (average >= 80) grade = "A";
                else if (average >= 60) grade = "B";
                else if (average >= 40) grade = "C";
                else grade = "Fail";

                JSONObject obj = new JSONObject();
                obj.put("name", name);
                obj.put("math", math);
                obj.put("science", science);
                obj.put("english", english);
                obj.put("total", total);
                obj.put("average", average);
                obj.put("grade", grade);

                result.put(obj);
            }
            System.out.println(result.toString());
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

