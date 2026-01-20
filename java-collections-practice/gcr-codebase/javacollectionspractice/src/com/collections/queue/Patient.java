package com.collections.queue;

public class Patient {
	String name;
	int priority;
	
	public Patient(String name, int priority) {
		this.name = name;
		this.priority = priority;
	}
	
	public String toString() {
		return name + " " + priority;
	}
}
