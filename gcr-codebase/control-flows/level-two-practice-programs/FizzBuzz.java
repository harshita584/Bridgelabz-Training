/* Program to print FizzBuzz for numbers from 1 to the given number */

import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Check for positive integer
        if (number < 0) {
            System.out.println("Invalid Input.");
        } 
        else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Check multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
                else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
                else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
