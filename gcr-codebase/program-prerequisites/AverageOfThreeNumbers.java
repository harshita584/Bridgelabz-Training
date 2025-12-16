// Program to calculate the average of three numbers

import java.util.*;

public class AverageOfThreeNumbers
{
    // Main method begins execution
    public static void main(String args[])
    {
        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter first number
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        // Ask the user to enter second number
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        // Ask the user to enter third number
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        // Calculate average using the formula:
        // Average = (num1 + num2 + num3) / 3
        double average = (num1 + num2 + num3) / 3.0;

        // Display the average
        System.out.println("Average is: " + average);
    }
}