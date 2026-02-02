package com.csvdatahandling.csvtojavaobjects;

import java.io.*;
import java.util.*;

public class CSVToObject {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] student = line.split(",");

                Student s = new Student(Integer.parseInt(student[0]), student[1], Integer.parseInt(student[2]), Integer.parseInt(student[3]));

                students.add(s);
            }

        } 
        catch (IOException e) {
            e.printStackTrace();
        }

        for (Student s : students) {
            System.out.println(s.id + " " + s.name + " " + s.age + " " + s.marks);
        }
    }
}
