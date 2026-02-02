package com.csvdatahandling.csvreportfromdatabase;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class EmployeeCSVReport {

    public static void generateCSV(List<Employee> employees, String fileName) {

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Employee ID,Name,Department,Salary");
            writer.write("\n");
            
            for (Employee e : employees) {
                writer.write( e.employeeId + "," + e.name + "," + e.department + "," + e.salary + "\n");
            }

        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        EmployeeDatabase db = new EmployeeDatabase();

        db.addEmployee(new Employee(1, "Emp1", "Dept1", 50000));
        db.addEmployee(new Employee(2, "Emp2", "Dept2", 40000));
        db.addEmployee(new Employee(3, "Emp3", "Dept3", 60000));

        EmployeeCSVReport.generateCSV(db.employees, "employees.csv");
    }
}
