package com.streams;

import java.io.*;

public class ReadLineByLine {
	public static void main(String[] args) {
		File file = new File("name.txt");
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] words = line.split(" ");
				boolean isPresent = false;
				
				for(String word : words) {
					if(word.equalsIgnoreCase("error")) {
						isPresent = true;
						break;
					}
				}
				if(isPresent) System.out.println(line);
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
