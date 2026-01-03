package com.objectmodeling.companyanddepartments;

import java.util.ArrayList;

public class Department {
    String deptName;
    ArrayList<Employee> employees;

    // Department constructor
    public Department(String deptName) {
        this.deptName = deptName;
        employees = new ArrayList<>();
    }

    // Add employee to department
    public void addEmployee(String empName) {
        employees.add(new Employee(empName));
    }

    // Display department details
    public void displayDepartment() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}
