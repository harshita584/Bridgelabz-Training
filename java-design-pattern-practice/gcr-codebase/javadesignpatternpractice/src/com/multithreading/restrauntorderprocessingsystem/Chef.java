package com.multithreading.restrauntorderprocessingsystem;

public class Chef extends Thread{
	String name;
	String dish;
	
	public Chef(String name, String dish) {
		this.name = name;
		this.dish = dish;
	}
	
	public void run() {
		try {
			System.out.println(name + " started preparing " + dish);
			
			if(dish.equals("Pizza")) Thread.sleep(3000);
			else if(dish.equals("Pasta")) Thread.sleep(2000);
			else if(dish.equals("Salad")) Thread.sleep(1000);
			else Thread.sleep(2500);
			
			System.out.println(name + " preparing " + dish + ": 25% complete");
			System.out.println(name + " preparing " + dish + ": 50% complete");
			System.out.println(name + " preparing " + dish + ": 75% complete");
		}
		catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
