import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0; // To store sum of cubes
        int originalNumber = number; // Keep a copy of the number

        // Calculate sum of cubes of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; 
            sum += digit * digit * digit; 
            originalNumber = originalNumber / 10;         }

        // Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is not an Armstrong Number.");
        }

        sc.close();
    }
}
