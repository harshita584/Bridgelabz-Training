// Write a program to find the sum of numbers until the user enters 0

import java.util.Scanner;
    public class TotalValue{
        public static void main(String args[]){
            double total = 0.0, value;

             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the value : ");
             value = sc.nextInt();

            while(value!=0)
            {
             total += value;
             System.out.println("Enter the value : ");
             value = sc.nextInt();
            }

            //Display the total value
            System.out.println("the total of the input values is : " + total);
    }
}

