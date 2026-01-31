package com.junit;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor {
    public void writeToFile(String filename, String content) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(content);
        writer.close();
    }

    public String readFromFile(String filename) throws IOException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        StringBuilder content = new StringBuilder();
        while (scanner.hasNextLine()) {
            content.append(scanner.nextLine());
        }

        scanner.close();
        return content.toString();
    }
}
