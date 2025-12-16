// Program to convert kilometers into miles

import java.util.*;

public class KilometerToMiles
{
    // Main method starts program execution
    public static void main(String args[])
    {
        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter distance in kilometers
        System.out.println("Enter distance in Kilometers: ");
        double kilometers = sc.nextDouble();

        // Convert kilometers to miles using the formula:
        // Miles = Kilometers × 0.621371
        double miles = kilometers * 0.621371;

        // Display the converted distance in miles
        System.out.println("Distance in Miles is: " + miles);
    }
}
