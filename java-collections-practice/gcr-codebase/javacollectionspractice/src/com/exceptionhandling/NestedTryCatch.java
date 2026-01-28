package com.exceptionhandling;

public class NestedTryCatch {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,0};
		
		try {
			try {
				System.out.println(arr[1]/arr[5]);
			} 
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index!");
			}
		} 
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero!");
		}
	}
}
