package com.employeemanagement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStream {
	public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "emp1", 25, "Male",   "sales", 2018, 15000),
                new Employee(2, "emp2", 28, "Female", "dept2", 2019, 48000),
                new Employee(3, "emp3", 30, "Male",   "dept3", 2007, 52000),
                new Employee(4, "emp4", 26, "Female", "dept4", 2020, 17000),
                new Employee(5, "emp5", 35, "Male",   "dept5", 2015, 65000),
                new Employee(6, "emp6", 29, "Female", "sales", 2021, 50000),
                new Employee(7, "emp7", 32, "Male",   "dept2", 2016, 60000),
                new Employee(8, "emp8", 27, "Female", "dept3", 2012, 46000),
                new Employee(9, "emp9", 34, "Male",   "dept4", 2014, 10000),
                new Employee(10,"emp10",24, "Female", "dept5", 2013, 42000)
            );
        
        // count male and female
        Map<String, Long> countMaleNFemale = employees.stream()
        		.collect(Collectors.groupingBy(
        				e -> e.gender,
						Collectors.counting()
				));
        System.out.println(countMaleNFemale);
        System.out.println();
        
        // Name of departments
        employees.stream()
        		.map(e -> e.department)
        		.distinct()
        		.forEach(System.out::println);
        System.out.println();
        
        // Average age of male and female
        Map<String, Double> averageAgeOfMaleNFemale = employees.stream()
        		.collect(Collectors.groupingBy(
        				e -> e.gender,
        				Collectors.averagingDouble(e -> e.age)
        		));
        System.out.println(averageAgeOfMaleNFemale);
        System.out.println();
        
        // Highest paid employees
        employees.stream()
        		.max((e1, e2) -> Double.compare(e2.salary, e1.salary))
        		.ifPresent(System.out::println);
        System.out.println();
        
        // Employees joined after 2015
        employees.stream()
        		.filter(e -> e.yearOfJoining >= 2015)
        		.forEach(e -> System.out.println(e.name));
        System.out.println();
        
        // Count employees in each department
        Map<String, Long> departmentEmployeeCount = employees.stream()
        		.collect(Collectors.groupingBy(
        				e -> e.department, 
        				Collectors.counting()
        		));
        System.out.println(departmentEmployeeCount);
        System.out.println();
        
        // Average salary
        Map<String, Double> averageSalaryDeptwise = employees.stream()
        		.collect(Collectors.groupingBy(
        				e -> e.department,
        				Collectors.averagingDouble(e -> e.salary)
        		));
        System.out.println(averageSalaryDeptwise);
        System.out.println();
        
        // Youngest employee
        employees.stream()
        		.min((e1, e2) -> Integer.compare(e1.age, e2.age))
        		.ifPresent(System.out::println);
        System.out.println();
        
        // most working experience in organization
        employees.stream()
        		.min((e1, e2) -> Integer.compare(e1.yearOfJoining, e2.yearOfJoining))
        		.ifPresent(System.out::println);
        System.out.println();
        
        // Find employees in department 4(sales)
        System.out.println(employees.stream()
        		.filter(e -> e.department.equalsIgnoreCase("sales"))
        		.count()); 
        System.out.println();
        
        // Average salary of male and female
        Map<String, Double> averageSalaryGenderWise = employees.stream()
        		.collect(Collectors.groupingBy(
        				e -> e.gender, 
        				Collectors.averagingDouble(e -> e.salary)
        		));
        System.out.println(averageSalaryGenderWise);
        System.out.println();
        
        // Name of all employees in each department
        Map<String, List<String>> deptWiseEmployees = employees.stream()
        		.collect(Collectors.groupingBy(
        				e -> e.department,
        				Collectors.mapping(e -> e.name, Collectors.toList())
        		));
        System.out.println(deptWiseEmployees);
        System.out.println();
        
        // Average salary and total salary 
        Double total = employees.stream()
        		.mapToDouble(e -> e.salary)
        		.sum();
        System.out.println("Total salary of whole org : " + total);
        
        employees.stream()
        		.mapToDouble(e -> e.salary)
        		.average()
        		.ifPresent(avg -> System.out.println("The average salary of whole org : " + avg));
        System.out.println();
        
        // 14. Employees salary more than 25k
        employees.stream()
        		.filter(e -> e.salary > 25000)
        		.forEach(System.out::println);
        System.out.println();
        
        // 15. Highest paid employee
        employees.stream()	
        		.max((e1, e2) -> Double.compare(e1.salary, e2.salary))
        		.ifPresent(System.out::println);
        System.out.println();
        
        // 16. Second highest paid employee
        employees.stream()
        		.sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
        		.skip(1)
        		.findFirst()
        		.ifPresent(System.out::println);
        System.out.println();
        
        // 17. Third highest paid employee
        employees.stream()
				.sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
				.skip(2)
				.findFirst()
				.ifPresent(System.out::println);
        System.out.println();
        
        // 18. Lowest paid employee
        employees.stream()	
				.min((e1, e2) -> Double.compare(e1.salary, e2.salary))
				.ifPresent(System.out::println);
        System.out.println();
        
        // 19. Second lowest paid employee
        employees.stream()
				.sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
				.skip(1)
				.findFirst()
				.ifPresent(System.out::println);
        System.out.println();
        
        // 20. First 5 lowest paid employee
        employees.stream()
				.sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
				.limit(5)
				.forEach(System.out::println);
        System.out.println();
        
        // 21. First 5 highest paid employee
        employees.stream()
				.sorted((e1, e2) -> Double.compare(e2.salary, e1.salary))
				.limit(5)
				.forEach(System.out::println);
        System.out.println();
	}
}
	