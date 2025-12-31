package com.inheritance.assistedproblems.employeemanagement;

public class Intern extends Employee {
    int duration; // internship duration in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    // Override displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Internship Duration: " + duration + " months");
        System.out.println();
    }
}
