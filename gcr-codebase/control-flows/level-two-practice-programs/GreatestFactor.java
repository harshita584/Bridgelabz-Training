// Program to find the greatest factor of a number other than itself

import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {

        int greatestFactor = 1;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number < 0) {
            System.out.println("Invalid Input.");
            return;
        } 
        else {
            // Loop to find the greatest factor
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break; // Stop at first (greatest) factor
                }
            }
        }

        // Print the result
        System.out.println(
            "The greatest factor of a number " + number + " beside itself is " + greatestFactor
        );
    }
}
