package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;


public class DriverClass {
    public static void main(String[] args) {
        File folder = new File("feedbacks");
        Map<String, List<String>> mp = new HashMap<>();

        mp.put("Positive", new ArrayList<>());
        mp.put("Neutral", new ArrayList<>());
        mp.put("Negative", new ArrayList<>());

        if(!folder.exists() || !folder.isDirectory()) {
            System.out.println("Feedback folder not found");
            return;
        }

        Pattern ratingPattern = Pattern.compile("(\\d+)/10");

        for(File file : folder.listFiles()) {
            if(!file.getName().endsWith(".txt")) continue;

            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;

                while((line = br.readLine()) != null) {
                    try {
                        Matcher m = ratingPattern.matcher(line);
                        if(!m.find()) throw new Exception("Rating not found");

                        String strRating = m.group();
                        int rating = 0;
                        if(strRating.charAt(1) == '/') rating = Integer.parseInt(strRating.substring(0, 1));
                        else rating = Integer.parseInt(strRating.substring(0, 2));

                        Feedback<String> feedback = new Feedback<>("Service", line, rating);

                        if(rating >= 7) mp.get("Positive").add(feedback.getText());
                        else if(rating >= 4) mp.get("Neutral").add(feedback.getText());
                        else mp.get("Negative").add(feedback.getText());

                    } 
                    catch(Exception e) {
                        
                    }
                }
            } 
            catch(IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }

        System.out.println("Positive Feedback:");
        System.out.println(mp.get("Positive"));

        System.out.println("Neutral Feedback:");
        System.out.println(mp.get("Neutral"));

        System.out.println("Negative Feedback:");
        System.out.println(mp.get("Negative"));
    }
}
