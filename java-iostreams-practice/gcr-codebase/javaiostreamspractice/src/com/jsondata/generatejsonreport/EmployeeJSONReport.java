package com.jsondata.generatejsonreport;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import org.json.JSONObject;

public class EmployeeJSONReport {
	public static void main(String[] args) {
		EmployeeDatabase database = new EmployeeDatabase();
		database.employees = List.of(
				new Employee(0, "Emp 1", "Dep 1", 1000000),
				new Employee(1, "Emp 2", "Dep 2", 100000),
				new Employee(2, "Emp 3", "Dep 2", 500000));
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("EmpJsonReport"))){
			for(Employee employee : database.employees) {
				JSONObject object = new JSONObject();
				object.put("Id", employee.employeeId);
				object.put("Name", employee.name);
				object.put("Department", employee.department);
				object.put("Salary", employee.salary);
				writer.write(object.toString());
				writer.write("\n");
			}
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
