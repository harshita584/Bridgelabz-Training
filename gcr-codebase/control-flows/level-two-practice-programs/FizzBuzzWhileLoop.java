// Program to print FizzBuzz using while loop

import java.util.Scanner;
public class FizzBuzzWhileLoop {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number < 0) {
            System.out.println("Invalid Input.");
        } 
        else {
            int i = 1;

            // Loop from 1 to the entered number
            while (i <= number) {

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

                i++; // Increment counter
            }
        }
    }
}
