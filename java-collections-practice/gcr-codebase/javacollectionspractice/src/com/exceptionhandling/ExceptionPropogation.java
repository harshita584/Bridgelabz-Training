package com.exceptionhandling;

public class ExceptionPropogation {
	private static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
	
	private static int helper(int a, int b) throws ArithmeticException {
		return divide(a, b);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(helper(10, 0));
		} 
		catch (Exception e) {
			System.out.println("Handled exception in main");
			System.out.println(e.getMessage());
		}
	}
}
