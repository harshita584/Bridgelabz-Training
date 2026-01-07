package com.linearandbinarysearch;

import java.io.*;

public class UserInputToFile {

    public static void main(String[] args) {

        String fileName = "userInput.txt";

        try {
            // create InputStreamReader to read from console
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            // create FileWriter to write to the file
            FileWriter fw = new FileWriter(fileName);

            String input;

            System.out.println("Enter text (type 'exit' to stop):");

            // read input until user types "exit"
            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                // write input to file and add new line
                fw.write(input + "\n");
            }

            // close resources
            fw.close();
            br.close();
            isr.close();

            System.out.println("User input has been written to " + fileName);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
