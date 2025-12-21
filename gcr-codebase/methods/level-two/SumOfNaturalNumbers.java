import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;           // Base condition
        }
        return n + sumUsingRecursion(n - 1);   // Recursive call
    }

    // Method to find sum using formula
    static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Checking for natural number
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
        } else {

            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);

            System.out.println("\nSum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            // Comparing results
            if (recursiveSum == formulaSum) {
                System.out.println("Result: Both computations are correct.");
            } else {
                System.out.println("Result: Computations do NOT match.");
            }
        }
    }
}
