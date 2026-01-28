package com.exceptionhandling;

public class MulitpleCatchBlocks {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = null;
		
		try {
			System.out.println(arr1[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(arr2[0]);
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
