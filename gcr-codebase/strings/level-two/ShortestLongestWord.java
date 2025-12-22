import java.util.Scanner;

public class ShortestLongestWord {

    // Find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            for (;;) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Split text into words without using split()
    public static String[] customSplit(String text) {

        int length = findLength(text);

        // Count number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount - 1];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        // Extract words
        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < spaceIndex.length; i++) {
            words[i] = text.substring(start, spaceIndex[i]);
            start = spaceIndex[i] + 1;
        }

        // Last word
        words[wordCount - 1] = text.substring(start, length);

        return words;
    }

    // Create 2D array of word and its length
    public static String[][] wordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // Find shortest and longest word indexes
    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int minLength = Integer.parseInt(table[0][1]);
        int maxLength = minLength;

        for (int i = 1; i < table.length; i++) {
            int currentLength = Integer.parseInt(table[i][1]);

            if (currentLength < minLength) {
                minLength = currentLength;
                shortestIndex = i;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input using nextLine()
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Split text into words
        String[] words = customSplit(text);

        // Create 2D array (word + length)
        String[][] table = wordLengthTable(words);

        // Find shortest and longest word indexes
        int[] result = findShortestAndLongest(table);

        // Printing results
        System.out.println("\nWords and their lengths:");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " -> " + table[i][1]);
        }

        System.out.println("\nShortest word: " + table[result[0]][0]
                + " (Length: " + table[result[0]][1] + ")");

        System.out.println("Longest word: " + table[result[1]][0]
                + " (Length: " + table[result[1]][1] + ")");
    }
}
