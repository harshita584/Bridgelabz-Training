package com.fourpillarsimplementation.employeemanagementsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee(101, "Harshita", 50000);
        Employee e2 = new PartTimeEmployee(102, "Amit", 40, 300);

        e1.assignDepartment("HR");
        e2.assignDepartment("IT");

        employees.add(e1);
        employees.add(e2);

        // polymorphism in action
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
