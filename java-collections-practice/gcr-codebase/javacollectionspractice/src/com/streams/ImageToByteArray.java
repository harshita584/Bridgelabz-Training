package com.streams;

import java.io.*;

public class ImageToByteArray {
	public static void main(String[] args) {
		File input = new File("\"C:\\Users\\Lenovo\\Downloads\\Harshita_Photo.jpg.jpeg\"");
		File output = new File("CopiedImaage.img");
		
		if(!input.exists()) {
			System.out.println("Input image not found!");
			return;
		}
		
		try(FileInputStream fileInputStream = new FileInputStream(input)){
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int byteRead;
			
			while((byteRead = fileInputStream.read(buffer)) != -1) {
				byteArrayOutputStream.write(buffer , 0, byteRead);
			}
			
			byte[] imageBytes = byteArrayOutputStream.toByteArray();			
			
			ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imageBytes);
			FileOutputStream fileOutputStream = new FileOutputStream(output);
			
			while((byteRead = byteArrayInputStream.read(buffer)) != -1) {
				fileOutputStream.write(buffer, 0, byteRead);
			}
			fileOutputStream.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
