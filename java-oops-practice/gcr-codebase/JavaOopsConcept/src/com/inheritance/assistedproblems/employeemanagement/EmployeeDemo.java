package com.inheritance.assistedproblems.employeemanagement;

public class EmployeeDemo {
    public static void main(String[] args) {

        // Polymorphic references
        Employee e1 = new Manager("Rohit", 101, 80000, 10);
        Employee e2 = new Developer("Anjali", 102, 60000, "Java");
        Employee e3 = new Intern("Karan", 103, 15000, 6);

        // Same method call, different behavior
        e1.displayDetails();
        e2.displayDetails();
        e3.displayDetails();
    }
}
