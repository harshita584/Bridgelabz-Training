// Program to find the factorial of a number entered by the user

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int number, factorial = 1;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        // Check for valid input
        if (number < 0) {
            System.out.println("The number is not valid.");
            return;
        } 
        else {
            // Calculate factorial using while loop
            while (number > 0) {
                factorial *= number;
                number--;
            }
        }

        // Print the factorial result
        System.out.println("The factorial is " + factorial);
    }
}
