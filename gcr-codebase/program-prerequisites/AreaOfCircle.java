// Program to calculate the area of a circle

import java.util.*;  // Import Scanner class for taking user input

public class AreaOfCircle
{
    // Main method where program execution starts
    public static void main(String args[])
    {
        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the radius of the circle
        System.out.println("Enter the Radius: ");

        // Read the radius entered by the user
        int radius = sc.nextInt();

        // Calculate the area of the circle using the formula:
        // Area = π × radius × radius
        double Area = 3.14 * radius * radius;

        // Display the calculated area
        System.out.println(Area);
    }
}
