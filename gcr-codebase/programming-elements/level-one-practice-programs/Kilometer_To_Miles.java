//Create a program to convert distance in kilometer to miles

import java.util.Scanner;

public class Kilometer_To_Miles
{
   
   public static void main(String[] args)
   {
    
    // Create Scanner object for input
    Scanner input = new Scanner(System.in);

    // Ask the user to enter distance in kilometers
    System.out.print("Enter distance in kilometers: ");
 
    // taking input from user
    double km = input.nextInt();

    // conversion formula
    double miles = km / 1.6;
 
    // Display the converted distance in miles
    System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
    }
}