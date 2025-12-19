import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking the number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int tempNumber = number;
        int digitCount = 0;

        // Count number of digits
        while (tempNumber != 0) {
            digitCount++;
            tempNumber = tempNumber / 10;
        }

        // Array to store digits of the number
        int[] digits = new int[digitCount];

        tempNumber = number;
        int index = 0;

        // Extract digits and store them in array
        while (tempNumber != 0) {
            digits[index] = tempNumber % 10;
            tempNumber = tempNumber / 10;
            index++;
        }

        // Frequency array for digits 0 to 9
        int[] frequency = new int[10];

        // Calculate frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            frequency[digits[i]]++;
        }

        // Displaying frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time");
            }
        }
    }
}
