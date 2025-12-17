// Write a program that takes your height in centimeters and converts it into feet and inches

import java.util.Scanner;

public class HeightConversion
{
    //Main method: program execution starts here
    public static void main(String args[])
    {
     
      // Create Scanner object for the input
      Scanner sc = new Scanner(System.in);

      // Ask the user to enter the height in centimeters
      System.out.println("Enter your height in centimeters: ");
 
      // taking input from user
      double heightCm = sc.nextDouble();
 
      // convert cm to inches
      double totalInches = heightCm / 2.54;

      // get feet
      int feet = (int)totalInches / 12;

      // remaining inches
      double inches = totalInches % 12;

      // Display the output
      System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and in inches is " + inches);
     }
}