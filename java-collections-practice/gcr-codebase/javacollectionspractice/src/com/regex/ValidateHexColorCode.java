package com.regex;

public class ValidateHexColorCode {
	private static boolean validate(String code) {
		return code.matches("^#[a-fA-F0-9]{6}$");
	}
	public static void main(String[] args) {
		System.out.println(validate("#FFA500"));
		System.out.println(validate("#ff4500"));
		System.out.println(validate("123"));
	}
}
