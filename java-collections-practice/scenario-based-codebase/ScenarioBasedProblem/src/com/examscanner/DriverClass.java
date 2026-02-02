package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DriverClass {
    public static void main(String[] args) {

        File file = new File("answers.csv");

        if(!file.exists()) {
            System.out.println("Answer file not found");
            return;
        }

        char[] answerKey = {'A','B','C','D','A','B','C'};

        AnswerSheet sheet = new MathAnswerSheet(answerKey);
        Map<String, Integer> scoreMap = new HashMap<>();
        PriorityQueue<StudentScore> pq = new PriorityQueue<>((a, b) -> b.score - a.score);

        Pattern formatPattern = Pattern.compile("^[A-Za-z ]+(,[A-D])+$");

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                try {
                    if(!formatPattern.matcher(line).matches()) throw new Exception("Invalid format");

                    String[] parts = line.split(",");
                    String name = parts[0];

                    char[] answers = new char[parts.length - 1];
                    for(int i = 1; i < parts.length; i++) {
                        answers[i - 1] = parts[i].charAt(0);
                    }

                    int score = sheet.evaluate(answers);
                    scoreMap.put(name, score);
                    pq.add(new StudentScore(name, score));

                } 
                catch(Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } 
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Final Scores:");
        for(String name : scoreMap.keySet()) {
            System.out.println(name + " -> " + scoreMap.get(name));
        }

        System.out.println("Rank List:");
        while(!pq.isEmpty()) {
            StudentScore s = pq.poll();
            System.out.println(s.name + " : " + s.score);
        }
    }
}
