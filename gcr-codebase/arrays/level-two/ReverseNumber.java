import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int digitCount = 0;

        // Count digits
        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Array to store digits in ORIGINAL order
        int[] digits = new int[digitCount];

        tempNumber = number;
        int index = digitCount - 1;

        // Store digits in original position
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index--;
        }

        // Reverse array using reverse loop
        int[] reverseDigits = new int[digitCount];
        int revIndex = 0;

        for (int i = digitCount - 1; i >= 0; i--) {
            reverseDigits[revIndex] = digits[i];
            revIndex++;
        }

        // Display reversed number
        System.out.print("Reversed Number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reverseDigits[i]);
        }
    }
}
