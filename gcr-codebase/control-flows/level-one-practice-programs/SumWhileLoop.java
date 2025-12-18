// Program to find the sum until user enters 0 or a negative number

import java.util.Scanner;
public class SumWhileLoop {
    public static void main(String args[]) {
        double total = 0.0;
        double value;

        // Scanner object to take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        value = sc.nextDouble();

        while (true) {
            if (value <= 0) {
                break;
            }

            // Adding the entered value to total
            total += value;

            System.out.println("Enter the value : ");
            value = sc.nextDouble();
        }

        // Printing the final sum
        System.out.println("The total sum of the input values is : " + total);
    }
}
