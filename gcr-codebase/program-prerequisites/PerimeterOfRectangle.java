// Program to calculate the perimeter of a rectangle

import java.util.*;

public class PerimeterOfRectangle
{
    // Main method starts program execution
    public static void main(String args[])
    {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the length
        System.out.println("Enter the Length: ");
        int length = sc.nextInt();

        // Ask the user to enter the width
        System.out.println("Enter the Width: ");
        int width = sc.nextInt();

        // Calculate the perimeter using the formula:
        // Perimeter = 2 × (length + width)
        int perimeter = 2 * (length + width);

        // Display the perimeter
        System.out.println("Perimeter of the Rectangle is: " + perimeter);
    }
}