package com.exceptionhandling;

public class ThrowNThrows {
	private static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException{
		if(amount < 0 || rate < 0) throw new IllegalArgumentException();
		
		return (amount * rate * years) / 100;
	}
	
	public static void main(String[] args) {
		double amount = 1000;
		double rate = 5;
		int years = 5;
		
		try {
			System.out.println(calculateInterest(amount, rate, years));
		}
		catch (IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}
	}
}
