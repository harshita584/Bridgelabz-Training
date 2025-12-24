import java.util.Scanner;

public class PalindromeChecker {

    // Function to take input
    static String getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Function to check palindrome
    static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Function to display result
    static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {
        String input = getInput();
        boolean result = isPalindrome(input);
        displayResult(result);
    }
}
