import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int count = 0; // To store number of digits
        int temp = number; // Copy of number to manipulate

        // Count digits
        while (temp != 0) {
            temp = temp / 10; 
            count++;         }

        System.out.println("Number of digits in " + number + " is: " + count);

        sc.close();
    }
}
