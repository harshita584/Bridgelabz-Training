import java.util.Scanner;

public class UniqueCharacterFrequency {

    // method to find unique characters
    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { seen = true; break; }
            }
            if (!seen) unique[count++] = c;
        }
        char[] result = new char[count];
        for (int i = 0; i < result.length; i++) {
            result[i]=unique[i];
        }
        return result;
    }

    // method to find frequency using unique characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] result = findFrequency(text);
        System.out.println("Unique character frequencies:");
        for (String[] row : result) {
            System.out.println(row[0] + " -> " + row[1]);
        }
        scanner.close();
    }
}
