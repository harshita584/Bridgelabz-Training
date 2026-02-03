package com.functionalinterfaces;

public class BackgroundJobExecution {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			for(int i = 0; i < 100; i++) System.out.println("Thread 1 : " + i);
		});
		
		Thread thread2 = new Thread(() -> {
			for(int i = 0; i < 100; i++) System.out.println("Thread 2 : " + i);
		});
		
		thread1.start();
		thread2.start();
	}
}
