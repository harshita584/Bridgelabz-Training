// Write a program to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.

import java.util.Scanner;
public class CanPersonVote{
    public static void main(String args[]){
        int age;
  
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        age = sc.nextInt();

        //Checking the age and printing the message
        if(age >= 18){
        System.out.println("The person's age is " + age + " and can vote.");
        }else{
        System.out.println("The person's age is " + age + " and cannot vote.");
        }
    }
}
 

        

