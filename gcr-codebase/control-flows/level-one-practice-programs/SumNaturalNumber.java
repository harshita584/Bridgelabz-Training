// Write a program to check for the natural number and write the sum of n natural numbers 

import java.util.Scanner;
public class SumNaturalNumber{
    public static void main(String args[]){
        int number;
  
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        number = sc.nextInt();
        
        // checking whether it is a natural number and printing its sum
        if(number >= 0){
        int sum = number * (number+1)/2;
        System.out.println("The sum of " + number + " natural numbers is " + sum);
        }
        else{
        System.out.println("The number " + number + " is not a natural number.");
        }
    }
}