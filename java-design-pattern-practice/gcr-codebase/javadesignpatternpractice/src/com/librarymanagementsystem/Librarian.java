package com.librarymanagementsystem;

public class Librarian implements User {
	private String name;
	
	public Librarian(String name) {
		this.name = name;
	}
	
	public void showRole() { 
		System.out.println(name + " is a Librarian.");
	}
	
	public void update(String msg) { 
		System.out.println(name + " notified: " + msg);
	}
}