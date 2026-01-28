package com.streams;

import java.io.*; 
public class EfficientReadAndWrite {
	public static void main(String[] args) { 
		File source = new File("D:\\Java programming workspace\\java-collections-practice\\gcr-codebase\\javacollectionspractice\\src\\name.txt"); 
		File destination1 = new File("result1.txt"); 
		File destination2 = new File("result2.txt"); 
		FileOutputStream fileOutputStream = null; 
		BufferedOutputStream bufferedOutputStream = null; 
		if(!source.exists()) {
			System.out.println("Source file not found!"); 
			return; 
		} 
		Long time = System.nanoTime(); 
		try(FileInputStream fileInputStream = new FileInputStream(source)) {
			fileOutputStream = new FileOutputStream(destination1); 
			int ch;
			while((ch = fileInputStream.read()) != -1) fileOutputStream.write(ch); 
		} 
		catch (IOException e) {
			System.err.println(e.getMessage()); 
		} 
		finally {
			try {
				fileOutputStream.close(); 
			} catch (IOException e) {
				System.out.println(e.getMessage()); 
			} 
		} 
		
		System.out.println("Normal file reader : " + (System.nanoTime() - time)); 
		time = System.nanoTime(); 
		
		try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(source))){ 
			bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destination2)); 
			int ch; 
			while((ch = bufferedInputStream.read()) != -1) bufferedOutputStream.write(ch); 
		} 
		catch(IOException e) { System.out.println(e.getMessage()); } 
		finally {
			try {
				bufferedOutputStream.close(); 
			} 
			catch (IOException e) { 
				e.printStackTrace(); 
			} 
		} 
		System.out.println("Buffered file reader :  " + (System.nanoTime() - time)); 
	} 
}












