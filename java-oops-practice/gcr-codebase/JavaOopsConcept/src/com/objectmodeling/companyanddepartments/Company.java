package com.objectmodeling.companyanddepartments;

import java.util.ArrayList;

public class Company {
    String companyName;
    ArrayList<Department> departments;

    // Company constructor
    public Company(String companyName) {
        this.companyName = companyName;
        departments = new ArrayList<>();
    }

    // Create and add department
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Add employee to a specific department
    public void addEmployeeToDepartment(int deptIndex, String empName) {
        departments.get(deptIndex).addEmployee(empName);
    }

    // Display company structure
    public void displayCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.displayDepartment();
        }
    }

    // Simulate deletion of company (composition effect)
    public void deleteCompany() {
        departments.clear(); // removes all departments and employees
        System.out.println("Company deleted. All departments and employees removed.");
    }
}
