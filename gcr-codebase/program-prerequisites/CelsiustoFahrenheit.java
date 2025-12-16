// Program to convert temperature from Celsius to Fahrenheit

import java.util.*;  // Import Scanner class for user input

public class CelsiustoFahrenheit
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter temperature in Celsius
        System.out.println("Enter the Temperature in Celsius: ");

        // Read the Celsius value entered by the user
        int Celsius = sc.nextInt();

        // Convert Celsius to Fahrenheit using the formula:
        // Fahrenheit = (Celsius × 9/5) + 32
        int Fahrenheit = (Celsius * 9 / 5) + 32;

        // Display the converted temperature in Fahrenheit
        System.out.println(Fahrenheit);
    }
}
