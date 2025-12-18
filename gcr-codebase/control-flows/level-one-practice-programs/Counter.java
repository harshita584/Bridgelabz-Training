// Write a program to count down the number from the user input value to 1 using a while loop for a rocket launch

import java.util.Scanner;
public class Counter{
    public static void main(String args[]){
        int counter;
        
        //Taking the input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the counter : ");
        counter = sc.nextInt();
        System.out.println();

        while(counter>=1){
        System.out.println(counter);
        counter--;
        }
       
        System.out.println("Launched Successfully..!);
        
   }
}
