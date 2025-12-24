import java.util.Scanner;

public class LongestWordInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking sentence as input
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // split the sentence into words
        String[] words = sentence.split(" ");

        String longestWord = "";

        // find the longest word
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        // print result
        System.out.println("Longest word in the sentence: " + longestWord);
    }
}
