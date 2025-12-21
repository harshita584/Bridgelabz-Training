import java.util.Scanner;

public class NumberCheck {

    // Method to check whether number is positive
    static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check whether number is even
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    static int compare(int num1, int num2) {

        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Taking input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println();

        // Checking positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");

                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }

            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println();
        System.out.println("Comparison of First and Last Element :- ");

        if (result == 1) {
            System.out.println("First element is Greater than Last element");
        } else if (result == 0) {
            System.out.println("First element is Equal to Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }
    }
}
