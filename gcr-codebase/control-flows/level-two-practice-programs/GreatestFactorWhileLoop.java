// Program to find the greatest factor of a number other than itself using while loop

import java.util.Scanner;
public class GreatestFactorWhileLoop {
    public static void main(String[] args) {

        int greatestFactor = 1;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Start checking from number - 1
        int counter = number - 1;

        // Loop to find the greatest factor
        while (counter >= 1) {

            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Stop after finding the greatest factor
            }

            counter--;
        }

        // Print the result
        System.out.println(
            "The greatest factor of a number " + number + " beside itself is " + greatestFactor
        );
    }
}
