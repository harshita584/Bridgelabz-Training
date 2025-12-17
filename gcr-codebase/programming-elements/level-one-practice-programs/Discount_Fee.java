// Write a new program similar to the program # 6 but take user input for Student Fee and University Discount

import java.util.Scanner;

public class Discount_Fee
{
    //Main method: program execution starts here
    public static void main(String args[])
    {
     
      // Create Scanner object for the input
      Scanner sc = new Scanner(System.in);

      // Ask the user to enter the fee amount
      System.out.println("Enter your University fee: ");
 
      // taking input from user
      int fee = sc.nextInt();

      // Ask the user to enter the discount percent
      System.out.println("Enter the discount percent: ");
 
      // taking input from user
      int discountPercent = sc.nextInt();
 
      //calculate the discounted amount
      int discount = (fee / 100) * discountPercent;
 
      //calculate the discounted price
      int discountedAmount = fee - discount;

      //Display the output
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedAmount );

     }
}