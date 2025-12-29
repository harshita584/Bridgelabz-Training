/*
The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.*/

import java.util.*;
public class NumberGuessing{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        // Generating the random number
        int number = random.nextInt(100) + 1;
        int attempts = 0;
       
       // do while to play the game
       do{
           System.out.println("Enter the guess number: ");
           int guess = sc.nextInt();
           if(number < guess)
           {
               System.out.println("Too high.");
           }
           else if(number > guess)
           {
               System.out.println("Too low.");
           }
           else
           {
               System.out.println("You Guessed the right number.");
               System.out.println("You WON the game.");
           }
          attempts++;
        }while(attempts<5);
 
     // Displaying the message
     System.out.println("You LOST the game.");
     System.out.println("The right number is : " + number + ".");
   }

}

