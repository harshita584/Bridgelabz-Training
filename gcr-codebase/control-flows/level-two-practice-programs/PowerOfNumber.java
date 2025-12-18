// Program to calculate the power of a number

import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;

        // Check for valid input
        if (number < 0 || power < 0) {
            System.out.println("Invalid Input");
            return;
        } 
        else {
            // Calculate power using for loop
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
        }

        // Print the result
        System.out.println("The power of a number " + number + " is " + result);
    }
}
