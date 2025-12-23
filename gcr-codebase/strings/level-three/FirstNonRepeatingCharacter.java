
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // method to find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; // ASCII frequency

        // count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // find first non-repeating
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }
        return '\0'; // return null char if none found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeating(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
        scanner.close();
    }
}
