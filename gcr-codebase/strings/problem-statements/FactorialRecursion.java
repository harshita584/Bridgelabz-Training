import java.util.Scanner;

public class FactorialRecursion {

    // Recursive function to calculate factorial
    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    // Function to take input
    static int getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return sc.nextInt();
    }

    // Function to display output
    static void displayResult(int num, int result) {
        System.out.println("Factorial of " + num + " is: " + result);
    }

    public static void main(String[] args) {
        int num = getInput();
        int result = factorial(num);
        displayResult(num, result);
    }
}
