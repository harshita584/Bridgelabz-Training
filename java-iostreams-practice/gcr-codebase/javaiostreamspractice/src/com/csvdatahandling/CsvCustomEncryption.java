package com.csvdatahandling;

import java.io.*;

public class CsvCustomEncryption {
    static int KEY = 2;

    static String encrypt(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char)(sb.charAt(i) + KEY));
        }
        return sb.toString();
    }

    static String decrypt(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            sb.setCharAt(i, (char)(sb.charAt(i) - KEY));
        }
        return sb.reverse().toString();
    }

    static void writeEncryptedCSV(String file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            bw.write("id,name,email,salary");
            bw.newLine();

            bw.write("1,name1," + encrypt("mail1@gmail.com") + "," + encrypt("50000"));
            bw.newLine();

            bw.write("2,name2," + encrypt("mail2@gmail.com") + "," + encrypt("60000"));
            bw.newLine();

            bw.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void readDecryptedCSV(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            System.out.println(line);

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                data[2] = decrypt(data[2]);
                data[3] = decrypt(data[3]);
                System.out.println(String.join(",", data));
            }
            br.close();
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String file = "employees.csv";
        writeEncryptedCSV(file);
        readDecryptedCSV(file);
    }
}
