import java.util.Scanner;
public class NumberCheckerExtends extends Number_Checker{

	    // Method to reverse the digits array
	    public static int[] reverseDigits(int[] digits) {
	        int[] reversed = new int[digits.length];

	        for (int i = 0; i < digits.length; i++) {
	            reversed[i] = digits[digits.length - 1 - i];
	        }
	        return reversed;
	    }

	    // Method to compare two arrays
	    public static boolean compareArrays(int[] arr1, int[] arr2) {
	        for (int i = 0; i < arr1.length; i++) {
	            if (arr1[i] != arr2[i]) {
	                return false;
	            }
	        }
	        return true;
	    }

	    // Method to check if number is palindrome using digits
	    public static boolean isPalindrome(int[] digits) {
	        int[] reversed = reverseDigits(digits);
	        return compareArrays(digits, reversed);
	    }


	    // main method
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();

	        int[] digits = storeDigits(number);

	        System.out.println("Count of Digits: " + countDigits(number));

	        System.out.print("Digits: ");
	        for (int i = 0; i < digits.length; i++) {
	            System.out.print(digits[i] + " ");
	        }
	        System.out.println();

	        int[] reversed = reverseDigits(digits);

	        System.out.print("Reversed Digits: ");
	        for (int i = 0; i < reversed.length; i++) {
	            System.out.print(reversed[i] + " ");
	        }
	        System.out.println();

	        System.out.println("Arrays Equal: " + compareArrays(digits, reversed));
	        System.out.println("Is Palindrome Number: " + isPalindrome(digits));
	        System.out.println("Is Duck Number: " + isDuckNumber(digits));

	        sc.close();
	    }
	}


