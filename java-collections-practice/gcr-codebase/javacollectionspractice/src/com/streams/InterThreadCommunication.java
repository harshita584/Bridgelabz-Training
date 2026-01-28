package com.streams;

import java.io.*;

public class InterThreadCommunication {
	public static void main(String[] args) {
		try {
			PipedOutputStream pipedOutputStream = new PipedOutputStream();
			PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
			
			Thread writer = new Thread(() -> {
				String str = "Message from thread";
				
				try {
					pipedOutputStream.write(str.getBytes());
					pipedOutputStream.close();
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			Thread reader = new Thread(() -> {
				int data;
				
				try {
					while((data = pipedInputStream.read()) != -1) {
						System.out.println(data);
					}
				} 
				catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			
			writer.start();
			reader.start();
			
			writer.join();
			reader.join();
			
			pipedInputStream.close();
			pipedOutputStream.close();
		}
		catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
