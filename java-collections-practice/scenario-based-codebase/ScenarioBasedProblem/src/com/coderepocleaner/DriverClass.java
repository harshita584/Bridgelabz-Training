package com.coderepocleaner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DriverClass {

    public static void main(String[] args) {

        File rootFolder = new File("source");

        Map<String, List<File>> fileMap = new HashMap<>();
        fileMap.put("Valid", new ArrayList<>());
        fileMap.put("Warning", new ArrayList<>());
        fileMap.put("Error", new ArrayList<>());

        Set<String> unusedImports = new HashSet<>();

        if(!rootFolder.exists() || !rootFolder.isDirectory()) {
            System.out.println("Source folder not found");
            return;
        }

        File[] files = rootFolder.listFiles();

        Pattern badMethodPattern =
                Pattern.compile("void\\s+[A-Z][a-zA-Z0-9]*\\s*\\(");
        Pattern importPattern =
                Pattern.compile("import\\s+([a-zA-Z0-9_.]+);");

        for(File file : files) {

            if(!file.getName().endsWith(".java")) continue;

            boolean hasWarning = false;
            boolean hasError = false;

            ArrayList<String> lines = new ArrayList<>();

            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while((line = br.readLine()) != null) lines.add(line);
            } 
            catch(IOException e) {
                System.out.println("Error reading file: " + file.getName());
                continue;
            }

            if(lines.size() == 0) {
                hasError = true;
            }

            for(String line : lines) {
                if(badMethodPattern.matcher(line).find()) hasWarning = true;
                Matcher m = importPattern.matcher(line);
                if(m.find()) {
                    String imp = m.group(1);
                    String className = imp.substring(imp.lastIndexOf('.') + 1);

                    boolean used = false;
                    for(String l : lines) {
                        if(l.contains(className)) {
                            used = true;
                            break;
                        }
                    }

                    if(!used) {
                        unusedImports.add(imp);
                        hasWarning = true;
                    }
                }
            }

            if(hasError) fileMap.get("Error").add(file);
            else if(hasWarning) fileMap.get("Warning").add(file);
            else fileMap.get("Valid").add(file);
        }

        System.out.println("valid files:");
        for(File f : fileMap.get("Valid")) {
            System.out.println(f.getName());
        }

        System.out.println("warning files:");
        for(File f : fileMap.get("Warning")) {
            System.out.println(f.getName());
        }

        System.out.println("error files:");
        for(File f : fileMap.get("Error")) {
            System.out.println(f.getName());
        }

        System.out.println("unused imports:");
        for(String imp : unusedImports) {
            System.out.println(imp);
        }
    }
}
