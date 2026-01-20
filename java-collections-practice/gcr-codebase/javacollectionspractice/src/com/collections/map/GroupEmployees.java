package com.collections.map;

import java.util.*;

public class GroupEmployees {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee("Alice", "HR"));
		list.add(new Employee("Bob", "HR"));
		list.add(new Employee("Carlo", "IT"));
		list.add(new Employee("Vicotr", "MR"));
		
		HashMap<String, List<Employee>> mp = new HashMap<>();
		
		for(Employee employee : list) {
			String dept = employee.department;
			if(!mp.containsKey(dept)) mp.put(dept, new ArrayList<Employee>());
			mp.get(dept).add(employee);
		}
		System.out.println(mp);
	}
}
