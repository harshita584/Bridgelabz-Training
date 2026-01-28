package com.streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	private static void writeOnFile(BufferedReader reader, FileOutputStream fileOutputStream) throws IOException {
		int ch = reader.read();
		while(reader.ready()) {
			fileOutputStream.write(ch);
			ch = reader.read();
		}
	}
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		File file = new File("userinput.txt");
		
		try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
			System.out.print("Enter your name : ");
			writeOnFile(reader, fileOutputStream);
			
			
			System.out.print("Enter your age : ");
			writeOnFile(reader, fileOutputStream);
			
			System.out.print("Enter your favorite programming language : ");
			writeOnFile(reader, fileOutputStream);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
