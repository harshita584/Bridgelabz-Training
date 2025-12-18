// Program to find all multiples of a number below 100

import java.util.Scanner;
public class MultipleOfNumber {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number >= 100 || number < 0) {
            System.out.println("Invalid Input");
            return;
        } 
        else {
            // Loop from 100 down to 1 to find multiples
            for (int i = 100; i >= 1; i--) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
