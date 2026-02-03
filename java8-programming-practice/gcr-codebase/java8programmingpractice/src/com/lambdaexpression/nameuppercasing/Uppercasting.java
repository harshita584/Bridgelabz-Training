package com.lambdaexpression.nameuppercasing;

import java.util.List;

public class Uppercasting {
	public static void main(String[] args) {
		List<Employee> employees = List.of(
				new Employee("employee1"),
				new Employee("employee2"),
				new Employee("employee3"),
				new Employee("employee4"),
				new Employee("employee5")	
		);
		
		List<Employee> updatEmployees = employees.stream().map(Employee::getName).map(String::toUpperCase).map(Employee::new).toList();
		
		updatEmployees.stream().map(Employee::getName).forEach(System.out::println);
	}
}