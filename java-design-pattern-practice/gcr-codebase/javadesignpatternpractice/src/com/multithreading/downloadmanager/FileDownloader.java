package com.multithreading.downloadmanager;

public class FileDownloader {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for(int i = 0; i <= 100; i += 5) {
				System.out.println("[Thread-1] Downloading Document.pdf " + i + "%");
				try {
					Thread.sleep(500);
				} 
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i <= 100; i += 5) {
				System.out.println("[Thread-2] Downloading Image.jpg " + i + "%");
				try {
					Thread.sleep(1000);
				} 
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		Thread t3 = new Thread(() -> {
			for(int i = 0; i <= 100; i += 5) {
				System.out.println("[Thread-3] Downloading Video.mp4 " + i + "%");
				try {
					Thread.sleep(1500);
				} 
				catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}
		catch (InterruptedException  e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("All downloads complete!");
		
	}
}
