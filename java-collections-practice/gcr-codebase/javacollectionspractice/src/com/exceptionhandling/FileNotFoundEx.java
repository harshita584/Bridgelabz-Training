package com.exceptionhandling;

import java.io.*;

public class FileNotFoundEx {
	public static void main(String[] args) {
		try(BufferedReader reader = new BufferedReader(new FileReader("input.txt"))){
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
