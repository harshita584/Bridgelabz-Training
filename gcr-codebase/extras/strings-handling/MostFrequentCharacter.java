import java.util.Scanner;

public class MostFrequentCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input string
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        int maxCount = 0;          // stores highest frequency
        char mostFrequent = ' ';  // stores result character

        // loop through each character
        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);
            int count = 0;

            // count how many times currentChar appears
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // update maximum count
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = currentChar;
            }
        }

        // print result
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
