package com.librarymanagementsystem;

public class UserFactory {
	public static User createUser(String type, String name) {
		return switch (type) {
			case "student" -> new Student(name);
			case "librarian" -> new Librarian(name);
			case "faculty" -> new Faculty(name);
			default -> throw new IllegalArgumentException("Unknown type");
		};
	}
}
