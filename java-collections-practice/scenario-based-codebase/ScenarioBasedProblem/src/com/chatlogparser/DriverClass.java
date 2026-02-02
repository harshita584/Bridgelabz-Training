package com.chatlogparser;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DriverClass {
    public static void main(String[] args) {
        File file = new File("chatlog.txt");

        if(!file.exists()) {
            System.out.println("file not found");
            return;
        }

        Map<String, List<String>> mp = new TreeMap<>();

        MessageFilter<String> filter = new IdleMessageFilter();

        Pattern pattern = Pattern.compile("\\\\] (.*?): (.*)");

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while((line = br.readLine()) != null) {
                Matcher m = pattern.matcher(line);
                if(!m.find()) continue;

                String time = m.group(1);
                String user = m.group(2);
                String message = m.group(3);

                if(!filter.allow(message)) {
                    continue;
                }

                if(!mp.containsKey(user)) {
                    mp.put(user, new ArrayList<>());
                }

                mp.get(user).add("[" + time + "] " + message);
            }

        } 
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Filtered Chat Messages:");

        for(String user : mp.keySet()) {
            System.out.println(user + ":");
            for(String msg : mp.get(user)) {
                System.out.print("  " + msg);
            }
            System.out.println();
        }
    }
}

