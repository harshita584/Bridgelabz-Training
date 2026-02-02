package com.jsondata.listtojsonarray;

import java.util.List;

import org.json.JSONArray;

public class ListToJsonArray {
	public static void main(String[] args) {
		List<Student> students = List.of(
				new Student("Name1", 20),
				new Student("Name2", 30),
				new Student("Name3", 25)
				);
		
		JSONArray result = new JSONArray(students);
		System.out.println(students.toString());
	}
}
