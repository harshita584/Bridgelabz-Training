package com.studentmanagement;

import java.util.List;

public class Student {
    int id;
    String name;
    int age;
    String gender;
    String department;
    String city;
    String state;
    int rank;
    List<String> contacts;

    public Student(int id, String name, int age, String gender, String department, String city, String state, int rank, List<String> contacts) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.city = city;
        this.state = state;
        this.rank = rank;
        this.contacts = contacts;
    }
	
	public String toString() {
		return id + " " + name + " " + department + " " + age + " " + gender + " " + city + " " + state + " " + rank + "\n" + contacts;
	}
}
