import java.util.Scanner;

public class DynamicLargestDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store in array
        while (number != 0) {

            // Increase array size if needed
            if (index == maxDigit) {
                maxDigit = maxDigit + 10;

                int[] temp = new int[maxDigit];

                // Copy old array to new array
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }

                // Assign temp array back to digits
                digits = temp;
            }

            digits[index] = number % 10; 
            number = number / 10;         
            index++;
        }

        // Initialize largest and second largest
        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digit
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying result
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
}
