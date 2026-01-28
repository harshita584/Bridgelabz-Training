package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter two numeric values : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println("Division result is " + (a/b));
		}
		catch (InputMismatchException | ArithmeticException e) {
			if(e instanceof InputMismatchException) System.out.println("Enter a valid numeric value");
			else System.out.println("Cannot divide by 0");
		}
	}
}
