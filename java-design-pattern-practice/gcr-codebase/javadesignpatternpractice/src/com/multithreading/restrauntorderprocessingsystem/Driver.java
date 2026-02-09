package com.multithreading.restrauntorderprocessingsystem;

public class Driver {
	public static void main(String[] args) {
		Chef chef1 = new Chef("Chef-1", "Pizza");
		Chef chef2 = new Chef("Chef-2", "Pasta");
		Chef chef3 = new Chef("Chef-3", "Salad");
		Chef chef4 = new Chef("Chef-4", "Burger");
		
		chef1.start();
		chef2.start();
		chef3.start();
		chef4.start();
		
		try {
			chef1.join();
			chef2.join();
			chef3.join();
			chef4.join();
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Kitchen closed - All orders completed");
	}
}
