// Write a program to check whether a number is positive, negative, or zero.

import java.util.Scanner;
public class CheckNumber{
    public static void main(String args[]){
        int number;
  
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        //Checking the number and printing the message
        if(number > 0){
        System.out.println("Positive.");
        }
        else if(number < 0){
        System.out.println("Negative.");
        }
        else{
        System.out.println("Zero.");
        }

    }
}
 

        

