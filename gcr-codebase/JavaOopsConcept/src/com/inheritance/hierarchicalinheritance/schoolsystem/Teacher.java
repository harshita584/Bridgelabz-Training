package com.inheritance.hierarchicalinheritance.schoolsystem;

	class Teacher extends Person {
	    String subject;

	    Teacher(String name, int age, String subject) {
	        super(name, age);
	        this.subject = subject;
	    }

	    void displayRole() {
	        System.out.println("Role: Teacher");
	        System.out.println("Subject: " + subject);
	    }
	}
