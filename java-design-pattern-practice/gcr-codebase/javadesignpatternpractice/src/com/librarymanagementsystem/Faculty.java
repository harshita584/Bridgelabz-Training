package com.librarymanagementsystem;

public class Faculty implements User{
	private String name;
	
	public Faculty(String name) {
		this.name = name;
	}
	
	public void showRole() { 
		System.out.println(name + " is a Faculty.");
	}
	
	public void update(String msg) { 
		System.out.println(name + " notified: " + msg);
	}
}
