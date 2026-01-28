package com.streams;

import java.io.Serializable;

public class Employee implements Serializable{
	int id;
	String name;
	String department;
	int salary;
	
	public Employee(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public String toString() {
		return id + " " + name + " " + department + " " + salary;
	}
}
