import java.util.Scanner;

public class CharacterFrequency {

    // method to find frequency of characters
    public static int[][] findFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // count unique characters
        int count = 0;
        for (int f : freq) if (f > 0) count++;

        int[][] result = new int[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;       // ASCII code
                result[index][1] = freq[i]; // frequency
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        int[][] result = findFrequency(text);
        System.out.println("Character frequencies:");
        for (int[] row : result) {
            System.out.println((char)row[0] + " -> " + row[1]);
        }
        scanner.close();
    }
}
