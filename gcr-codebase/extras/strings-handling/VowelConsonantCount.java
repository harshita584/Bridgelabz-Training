import java.util.Scanner;

public class VowelConsonantCount {

    // Check if character is vowel, consonant or not a letter
    public static String checkCharacter(char ch) {

        // Convert uppercase to lowercase using ASCII values
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {

            // Check for vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        // Not a letter
        return "Not a Letter";
    }

    // Find vowels and consonants using charAt()
    public static int[] findVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            String result = checkCharacter(ch);

            if (result.equals("Vowel")) {
                vowelCount++;
            } else if (result.equals("Consonant")) {
                consonantCount++;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Call user-defined method
        int[] counts = findVowelsAndConsonants(input);

        // Printing result
        System.out.println("\nNumber of Vowels: " + counts[0]);
        System.out.println("Number of Consonants: " + counts[1]);
    }
}
