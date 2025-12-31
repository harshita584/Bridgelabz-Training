package com.inheritance.assistedproblems.employeemanagement;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayDetails()
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println();
    }
}
