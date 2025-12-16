// Program to calculate power of a number

import java.util.*;

public class PowerCalculation
{
    // Main method starts program execution
    public static void main(String args[])
    {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the base number
        System.out.println("Enter the Base: ");
        double base = sc.nextDouble();

        // Ask the user to enter the exponent
        System.out.println("Enter the Exponent: ");
        double exponent = sc.nextDouble();

        // Calculate power using Math.pow() method
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println("Result is: " + result);
    }
}