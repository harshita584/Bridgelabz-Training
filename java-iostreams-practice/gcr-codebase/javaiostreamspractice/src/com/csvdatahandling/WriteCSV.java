package com.csvdatahandling;

import java.io.*;

public class WriteCSV {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("employees.csv"))) {
            bw.write("Id,Name,Department,Salary");
            bw.newLine();

            bw.write("0,name1,dept1,55000");
            bw.newLine();

            bw.write("1,name2,dept2,48000");
            bw.newLine();

            bw.write("2,name3,dept3,62000");
            bw.newLine();

            bw.write("3,name4,dept4,45000");
            bw.newLine();

            bw.write("4,name5,dept5,70000");
            bw.newLine();

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

