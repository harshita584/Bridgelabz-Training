package com.csvdatahandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) {

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^\\d{10}$";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader("users.csv"))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] user = line.split(",");

                boolean valid = true;

                if (!emailPattern.matcher(user[2]).matches()) {
                    System.out.println("Error : Invalid Email " + line);
                    valid = false;
                }

                if (!phonePattern.matcher(user[3]).matches()) {
                    System.out.println("Error : Invalid Phone number" + line);
                    valid = false;
                }
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
