package com.functionalinterfaces.dataserialization;

import java.io.Serializable;

public class Backup {
	public static void main(String[] args) {
		Student student = new Student(0, "Student Name");
		System.out.println(student instanceof Serializable);
	}
}
