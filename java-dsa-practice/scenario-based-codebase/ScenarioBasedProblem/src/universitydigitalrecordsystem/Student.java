package com.universitydigitalrecordsystem;

public class Student {
	int rollno;
	String details;
	
	Student left;
	Student right;
	
	public Student(int rollno, String details) {
		this.rollno = rollno;
		this.details = details;
	}
	
	public String toString() {
		return rollno + " " + details;
	}
}
