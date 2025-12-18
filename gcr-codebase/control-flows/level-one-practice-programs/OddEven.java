// Program to print odd and even numbers from 1 to the given number

import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {
        int number;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        // Check for valid input
        if (number < 0) {
            System.out.println("It is an invalid input.");
            return;
        } 
        else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++) {

                // Check if the number is even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number.");
                } 
                else {
                    System.out.println(i + " is an odd number.");
                }
            }
        }
    }
}
