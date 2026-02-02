package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DriverClass {
	private static String readFile(File file) throws Exception {
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                sb.append(line).append(" ");
            }
        }
        return sb.toString();
    }

    private static String extractEmail(String text) {
        Pattern p =Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+");
        Matcher m = p.matcher(text);
        
        if(m.find()) return m.group();
        return null;
    }

    private static String extractPhone(String text) {
        Pattern p = Pattern.compile("[0-9]{10}");
        Matcher m = p.matcher(text);
        if(m.find()) return m.group();
        return null;
    }

    private static int countKeywords(String text) {
        int count = 0;
        String[] keywords = {"java", "python", "spring"};

        text = text.toLowerCase();
        for(String k : keywords) {
            Matcher m = Pattern.compile(k).matcher(text);
            while(m.find()) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        File folder = new File("resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();
        ArrayList<ResumeData> sortedList = new ArrayList<>();

        if(!folder.exists() || !folder.isDirectory()) {
            System.out.println("Resume folder not found");
            return;
        }

        File[] files = folder.listFiles();

        for(File file : files) {
            try {
                if(!file.getName().endsWith(".txt")) {
                    throw new Exception("Invalid file format");
                }

                String content = readFile(file);

                String email = extractEmail(content);
                String phone = extractPhone(content);
                int keywordCount = countKeywords(content);

                if(email != null) {
                    ResumeData data = new ResumeData(email, phone, keywordCount);
                    resumeMap.put(email, data);
                }

            } 
            catch(Exception e) {
                System.out.println("Skipping file: " + file.getName());
            }
        }

        sortedList.addAll(resumeMap.values());
        Collections.sort(sortedList, (a, b) -> b.getKeywordCount() - a.getKeywordCount());
        
        for(ResumeData r : sortedList) {
            System.out.println(r);
        }
    }
}
