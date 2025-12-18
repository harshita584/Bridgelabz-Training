import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Assume number is prime initially
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number-1
            for (int i = 2; i <= number / 2; i++) { // We can check up to number/2 for efficiency
                if (number % i == 0) {
                    isPrime = false; // Number is divisible by i, so not prime
                    break; // No need to check further
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }

        sc.close(); // Close scanner
    }
}
