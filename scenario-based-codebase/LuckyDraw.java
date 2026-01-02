/*Festival Lucky Draw 
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.*/

import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {

        // Variable to store the drawn number and number of visitors
        int number, visitors;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask for total number of visitors
        System.out.println("Enter the number of visitors: ");
        visitors = sc.nextInt();

        // Loop to handle multiple visitors
        for (int i = 0; i < visitors; i++) {

            // Ask each visitor to draw a number
            System.out.println("\nEnter the number that visitor " + (i+1) + " draws: ");
            number = sc.nextInt();

            // Check for invalid input
            if (number <= 0) {
                System.out.println("Invalid Input.");
                // Skip the current visitor and move to the next one
                continue;
            }

            // Check if number is divisible by both 3 and 5
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift.");
            } 
            // If number is not divisible by both 3 and 5
            else {
                System.out.println("Sorry, better luck next time!");
            }
        }

        // Close the scanner
        sc.close();
    }
}
