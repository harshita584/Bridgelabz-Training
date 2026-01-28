package com.exceptionhandling;

import java.util.Scanner;

public class FinallyBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter 2 integers : ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a/b);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Operation completed");
			sc.close();
		}
	}
}
