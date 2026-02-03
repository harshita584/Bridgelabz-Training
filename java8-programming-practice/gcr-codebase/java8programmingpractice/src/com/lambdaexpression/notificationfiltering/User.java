package com.lambdaexpression.notificationfiltering;

public class User {
	String name;
	boolean preference;
	
	public User(String name, boolean preference) {
		this.name = name;
		this.preference = preference;
	}
	
	public void sendNotification() {
		System.out.println("Sent notification to " + name);
	}
}
