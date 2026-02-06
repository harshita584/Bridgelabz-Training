package com.collectors.categorizesalary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Categorize {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("IT", 60000),
                new Employee("HR", 40000),
                new Employee("IT", 80000),
                new Employee("HR", 50000),
                new Employee("IT", 70000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)
                        ));

        avgSalaryByDept.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
