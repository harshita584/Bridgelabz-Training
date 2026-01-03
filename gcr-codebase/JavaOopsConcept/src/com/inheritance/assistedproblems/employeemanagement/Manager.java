package com.inheritance.assistedproblems.employeemanagement;

public class Manager extends Employee {
    int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // call base class constructor
        this.teamSize = teamSize;
    }

    // Override displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
        System.out.println();
    }
}
