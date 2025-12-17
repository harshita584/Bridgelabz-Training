// Write a program to take 2 numbers and print their quotient and reminder

import java.util.Scanner;
public class QuotientRemainder{
    public static void main(String args[]){
        int number1, number2, Quotient, Remainder;

        // Taking the input and performing the calculation
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        number1 = sc.nextInt(); 
        System.out.println("Enter the number 2 : ");
        number2 = sc.nextInt();
        Quotient = number1 / number2;
        Remainder = number1 % number2;

        // Displaying the output
        System.out.println("The Quotient is " + Quotient + " and Reminder is " + Remainder + " of two number " + number1 + " and " + number2);
        }
}

         