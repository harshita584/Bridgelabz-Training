import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: iterative
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    // Logic 2: recursive
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: using arrays
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = text.charAt(original.length - 1 - i);
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Iterative: " + isPalindromeIterative(text));
        System.out.println("Recursive: " + isPalindromeRecursive(text, 0, text.length()-1));
        System.out.println("Array: " + isPalindromeArray(text));

        scanner.close();
    }
}
