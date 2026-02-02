package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DriverClass {
    public static void main(String[] args) {
        File file = new File("results.csv");

        if(!file.exists()) {
            System.out.println("Result file not found");
            return;
        }

        ExamResult<String> exam = new ExamResult<>("Final Exam");

        Map<String, List<Integer>> subjectMarks = new HashMap<>();

        Pattern linePattern = Pattern.compile("\\d+,[A-Za-z]+,[A-Za-z]+,\\d+");

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                try {
                    if(!linePattern.matcher(line).matches()) {
                        throw new InvalidResultFormatException("Invalid format: " + line);
                    }

                    String[] parts = line.split(",");

                    int rollNo = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String subject = parts[2];
                    int marks = Integer.parseInt(parts[3]);

                    if(marks < 0 || marks > 100) {
                        throw new InvalidResultFormatException("Invalid marks: " + marks);
                    }

                    if(!subjectMarks.containsKey(subject)) {
                        subjectMarks.put(subject, new ArrayList<>());
                    }

                    subjectMarks.get(subject).add(marks);

                } 
                catch(InvalidResultFormatException e) {
                    System.out.println(e.getMessage());
                }
            }

        } 
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Exam Type: " + exam.getExamType());

        System.out.println("Top Scorers Per Subject:");

        for(String subject : subjectMarks.keySet()) {
            PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a) ;
            pq.addAll(subjectMarks.get(subject));
            System.out.println(subject + " " + pq.peek());
        }
    }
}
