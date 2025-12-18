// Program to find the power of a number using while loop

import java.util.Scanner;

public class PowerOfNumberWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Enter the power: ");
        int power = sc.nextInt();

        // Validate input
        if (number < 0 || power < 0) {
            System.out.println("Invalid Input");
            return;
        }

        // Initialize result and counter
        int result = 1;
        int counter = 0;

        // While loop to calculate power
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Print result
        System.out.println("The power of a number " + number + " is " + result);
    }
}
