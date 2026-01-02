package com.fourpillarsimplementation.employeemanagementsystem;

class FullTimeEmployee extends Employee {

    FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary;
    }
}

