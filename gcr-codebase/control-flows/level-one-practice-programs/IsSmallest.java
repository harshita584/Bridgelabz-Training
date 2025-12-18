// Write a program to check if the first is the smallest of the 3 numbers.

import java.util.Scanner;
public class IsSmallest{
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
        boolean result = (number1 < number2 && number1 < number3); 

        //Printing the result
        System.out.println("Is the first number the smallest? " + result);
       }
}