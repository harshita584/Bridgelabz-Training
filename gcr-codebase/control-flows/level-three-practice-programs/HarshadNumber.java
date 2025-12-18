import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0; // To store sum of digits
        int temp = number; // Copy of number to manipulate

        // Calculate sum of digits
        while (temp != 0) {
            int digit = temp % 10; 
            sum += digit;          
            temp = temp / 10;      
        }

        // Check if number is divisible by sum of digits
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }

        sc.close();
    }
}
