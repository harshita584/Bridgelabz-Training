package com.streams;


import java.io.*;

public class ReadAndWrite {
	public static void main(String[] args) {
		File source = new File("name.txt");
		File destination = new File("destination.java");
		FileOutputStream fileOutputStream = null;
		
		if(!source.exists()) {
			System.out.println("Source file does not exist!");
			return;
		}
		
		try(FileInputStream fileInputStream = new FileInputStream(source)){
			fileOutputStream = new FileOutputStream(destination);
			int data;
			
			while((data = fileInputStream.read()) != -1) fileOutputStream.write(data);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fileOutputStream.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
