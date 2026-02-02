package com.csvdatahandling;

import java.io.*;

public class ReadCSV {
    public static void main(String[] args) throws Exception {
    	try(BufferedReader reader = new BufferedReader(new FileReader("students.csv"))){
    		String line;

    		reader.readLine();

    		while ((line = reader.readLine()) != null) {
    			String[] student = line.split(",");

    			System.out.println(student[0] + " " + student[1] + " " + student[2] + " " + student[3]);
    		}
    	}
    	catch(IOException e) {
    		System.out.println(e.getMessage());
    	}
    }
}
