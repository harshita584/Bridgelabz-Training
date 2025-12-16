// Program to calculate Simple Interest

import java.util.*;  // Import Scanner class for user input

public class SimpleInterest
{
    // Main method where program execution starts
    public static void main(String args[])
    {
        // Create Scanner object to read input values
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the Principal amount
        System.out.println("Enter the Principal: ");
        double principal = sc.nextDouble();

        // Ask the user to enter the Rate of Interest
        System.out.println("Enter the Rate of Interest: ");
        double rate = sc.nextDouble();

        // Ask the user to enter the Time period
        System.out.println("Enter the Time (in years): ");
        double time = sc.nextDouble();

        // Calculate Simple Interest using the formula:
        // Simple Interest = (Principal × Rate × Time) / 100
        double simpleInterest = (principal * rate * time) / 100;

        // Display the calculated Simple Interest
        System.out.println("Simple Interest is: " + simpleInterest);
    }
}
