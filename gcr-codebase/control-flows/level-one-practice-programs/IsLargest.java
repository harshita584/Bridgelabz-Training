// Write a program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;
public class IsLargest{
    public static void main(String args[]){
        int number1, number2, number3;
        
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 : ");
        number1 = sc.nextInt();

        System.out.println("Enter the number2 : ");
        number2 = sc.nextInt();

        System.out.println("Enter the number3 : ");
        number3 = sc.nextInt();

        // Checking by using if statement
        boolean result1 = (number1 > number2 && number1 > number3);
        boolean result2 = (number2 > number1 && number2 > number3);
        boolean result3 = (number3 > number1 && number3 > number2);

        //Printing the result
        System.out.println(" Is the first number the largest? " + result1 + "\n" +
                           " Is the second number the largest? " + result2 + "\n" +
                           " Is the third number the largest? " + result3);
    }
}