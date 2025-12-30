package com.keywords;

public class Company {

    // common company name for all employees
    static String companyName;
    static int totalEmployees = 0;

    // instance variables
    String name;
    final int id;      // employee id should not change
    String designation;

    // constructor
    public Company(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // set company name
    public static void setCompanyName(String name) {
        companyName = name;
    }

    // show total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees : " + totalEmployees);
    }

    // display employee details
    public void displayEmployeeDetails() {

        // checking object using instanceof
        if (this instanceof Company) {
            System.out.println("Company Name : " + companyName);
            System.out.println("Employee ID : " + id);
            System.out.println("Name : " + name);
            System.out.println("Designation : " + designation);
            System.out.println();
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getDesignation() {
        return designation;
    }

    public static void main(String[] args) {

        // set company name
        Company.setCompanyName("Tech Solutions Inc.");

        // create employee objects
        Company emp1 = new Company("Harshita", 101, "Software Engineer");
        Company emp2 = new Company("Rohan", 102, "Project Manager");

        // display count
        Company.displayTotalEmployees();

        // display details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
