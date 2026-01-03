package com.objectmodeling.companyanddepartments;

public class Employee {
    String empName;

    public Employee(String empName) {
        this.empName = empName;
    }

    public void displayEmployee() {
        System.out.println("Employee: " + empName);
    }
}

