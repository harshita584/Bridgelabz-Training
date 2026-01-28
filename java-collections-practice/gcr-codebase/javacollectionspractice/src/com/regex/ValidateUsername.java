package com.regex;

public class ValidateUsername {
	private static boolean validateUsername(String username) {
		return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
	}
	
	public static void main(String[] args) {
		System.out.println(validateUsername("username1"));
		System.out.println(validateUsername("user_123"));
		System.out.println(validateUsername("123user"));
		System.out.println(validateUsername("us"));
	}
}
