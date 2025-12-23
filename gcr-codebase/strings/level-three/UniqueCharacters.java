import java.util.Scanner;

public class UniqueCharacters {

    // method to find length of text without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // will throw exception when out of bounds
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end of string
        }
        return count;
    }

    // method to find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // check if currentChar appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // create new array with only unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueChars[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // finding unique characters
        char[] unique = findUniqueCharacters(text);

        // displaying the result
        System.out.print("Unique characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}
