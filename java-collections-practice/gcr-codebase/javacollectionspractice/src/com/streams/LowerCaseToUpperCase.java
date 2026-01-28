package com.streams;

import java.io.*;

public class LowerCaseToUpperCase {
	public static void main(String[] args) {
		File inputFile = new File("Name.txt");
		File outputFile = new File("Result.txt");
		FileOutputStream fileOutputStream = null;
		
		if(!inputFile.exists()) {
			System.out.println("Input file does not exist!");
			return;
		}
		
		try(BufferedReader reader = new BufferedReader(new FileReader(inputFile))){
			fileOutputStream = new FileOutputStream(outputFile);
			int ch;
			
			while((ch = reader.read()) != -1) {
				if(ch >= 65 && ch <= 90) ch += 32;
				fileOutputStream.write(ch);
			}
			System.out.println("Copied successfully!");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
