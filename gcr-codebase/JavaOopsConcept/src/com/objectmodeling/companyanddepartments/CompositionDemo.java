package com.objectmodeling.companyanddepartments;

public class CompositionDemo {
    public static void main(String[] args) {

        Company company = new Company("Tech Solutions");

        // Add departments
        company.addDepartment("IT");
        company.addDepartment("HR");

        // Add employees
        company.addEmployeeToDepartment(0, "Amit");
        company.addEmployeeToDepartment(0, "Riya");
        company.addEmployeeToDepartment(1, "Neha");

        // Display company structure
        company.displayCompany();

        // Delete company
        company.deleteCompany();
    }
}

