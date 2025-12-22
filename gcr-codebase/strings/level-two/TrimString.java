import java.util.Scanner;

public class TrimString {

    // Find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }

        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();

        // Find trim indexes
        int[] indexes = findTrimIndexes(input);

        // Create trimmed string using custom substring
        String customTrimmed = createSubstring(input, indexes[0], indexes[1]);

        // Trim using built-in trim()
        String builtInTrimmed = input.trim();

        // Compare both results
        boolean isSame = compareStrings(customTrimmed, builtInTrimmed);

        // Printing result
        System.out.println("\nCustom trimmed string: [" + customTrimmed + "]");
        System.out.println("Built-in trimmed string: [" + builtInTrimmed + "]");
        System.out.println("Are both strings equal? " + isSame);
    }
}
