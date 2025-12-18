// Program to print the multiplication table of a number from 6 to 9

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String args[]) {
        int number;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = sc.nextInt();

        // Loop to print multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
