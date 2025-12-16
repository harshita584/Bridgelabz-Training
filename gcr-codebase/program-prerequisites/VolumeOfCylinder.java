// Program to calculate the volume of a cylinder

import java.util.*;  // Import Scanner class for user input

public class VolumeOfCylinder
{
    // Main method: execution of the program starts here
    public static void main(String args[])
    {
        // Create Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the radius of the cylinder
        System.out.println("Enter the Radius: ");
        int radius = sc.nextInt();

        // Ask the user to enter the height of the cylinder
        System.out.println("Enter the Height: ");
        int height = sc.nextInt();

        // Calculate the volume of the cylinder using the formula:
        // Volume = π × radius × radius × height
        double Area = 3.14 * radius * radius * height;

        // Display the calculated volume
        System.out.println(Area);
    }
}
