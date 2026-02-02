package com.csvdatahandling.csvreportfromdatabase;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
    List<Employee> employees;
    public EmployeeDatabase() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
