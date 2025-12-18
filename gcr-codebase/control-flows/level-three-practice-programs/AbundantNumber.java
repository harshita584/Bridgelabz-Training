import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0; // To store sum of divisors

        // Find divisors and sum them
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { 
                sum += i;                     }
        }

        // Check if sum of divisors is greater than the number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }

        sc.close();
    }
}
