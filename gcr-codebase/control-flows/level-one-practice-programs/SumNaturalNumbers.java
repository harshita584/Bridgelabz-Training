// Program to find the sum of n natural numbers using while loop
// and verify it using the formula n*(n+1)/2

import java.util.Scanner;
public class SumNaturalNumbers {
    public static void main(String args[]) {
        int number, sum = 0;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        // Store original value for formula calculation
        int num = number;

        // Check if number is a natural number
        if (number < 0) {
            System.out.println("The number is not a natural number.");
            return;
        } 
        else {
            // Calculate sum using while loop
            while (number > 0) {
                sum = sum + number;
                number--;
            }
        }

        // Calculate sum using formula
        int sumFormula = num * (num + 1) / 2;

        // Compare both results
        if (sum == sumFormula) {
            System.out.println("The Computation is correct.");
        } 
        else {
            System.out.println("The Computation is not correct.");
        }
    }
}
