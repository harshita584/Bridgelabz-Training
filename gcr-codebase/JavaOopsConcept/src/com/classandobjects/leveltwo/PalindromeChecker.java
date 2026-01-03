package com.classandobjects.leveltwo;

public class PalindromeChecker {
	//Attribute
	String text;
	
	//Creating the method check palindrome
	PalindromeChecker(String text) {
		this.text=text;
		
	}
	//Creating the method to check its palindrome or not
	public boolean isPalindrome() {
	//To remove the space and return consistent text
	String cleantext=text.replaceAll("\\s","").toLowerCase();
	
	//to reverse the string
	String reverseText=new StringBuilder(cleantext).reverse().toString();
	
	return cleantext.equals(reverseText);
	}
	
	public void diplayResult() {
		if(isPalindrome()) {
			System.out.println(text+" is palindrome");
			}
		else {
			System.out.println(text+" is not Palindrome");
		}
	}
	public static void main(String[] args) {
		//creating object to check the text
		 PalindromeChecker checker1 = new PalindromeChecker("A man a plan a canal Panama");
		 checker1.diplayResult();
		
		 //creating object to check the text
		 PalindromeChecker checker2 = new PalindromeChecker("Hello");
		 checker2.diplayResult();
	}
}
