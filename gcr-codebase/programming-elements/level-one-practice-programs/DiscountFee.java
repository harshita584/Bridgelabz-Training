/* The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course. */

public class DiscountFee
{
    // Main method: program execution starts here
    public static void main(String args[])
    {
      int fee = 125000;
      int discountPercent = 10;
 
      //calculate the discounted amount
      int discount = (fee/100)*10;
 
      //calculate the discounted price
      int discountedAmount = fee - discount;

      //Display the output
      System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedAmount );
    }
}
