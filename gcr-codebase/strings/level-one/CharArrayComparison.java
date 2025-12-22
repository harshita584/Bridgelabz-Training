import java.util.Scanner;

public class CharArrayComparison {

    // Method to return characters of a string without using toCharArray()
    public static char[] getCharacters(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean isEqual(char[] arr1, char[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String text = sc.next();

        // User-defined method
        char[] customArray = getCharacters(text);

        // Built-in method
        char[] builtInArray = text.toCharArray();

        // Compare results
        boolean result = isEqual(customArray, builtInArray);

        // Display result
        System.out.println("Characters using user-defined method:");
        for (char c : customArray) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nAre both character arrays equal? " + result);

        sc.close();
    }
}
