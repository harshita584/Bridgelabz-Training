package com.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class SaveAndRetrieveObject {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
				new Employee(0, "Emp 1", "Dept 1", 10000),
				new Employee(0, "Emp 2", "Dept 2", 20000),
				new Employee(0, "Emp 3", "Dept 3", 30000),
				new Employee(0, "Emp 4", "Dept 4", 40000),
				new Employee(0, "Emp 5", "Dept 5", 50000)
			));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))){
			oos.writeObject(employees);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("employee.dat")))){
			System.out.println(ois.readObject());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
