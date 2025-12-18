// Program to find all the multiples of a number below 100 using while loop

import java.util.Scanner;

public class MultipleOfNumberWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // Check for valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid Input");
            return;
        }

        // Initialize counter
        int counter = number - 1;

        // While loop to find multiples
        while (counter >= 1) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
