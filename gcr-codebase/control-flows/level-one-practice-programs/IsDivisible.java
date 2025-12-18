// Write a program to check if a number is divisible by 5

import java.util.Scanner;
public class IsDivisible{
    public static void main(String args[]){
        int number;
        
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        // Check divisibility
        boolean result = (number%5 == 0);
 
        //Printing the result
        System.out.println("Is the number " + number + " divisible by 5? " + result);
       }
}
