import java.util.Scanner;

public class ReplaceWord {

    // method to replace old word with new word
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String result = "";   // to store final sentence
        int i = 0;

        while (i < sentence.length()) {

            // check if oldWord matches at current position
            if (i + oldWord.length() <= sentence.length()
                    && sentence.substring(i, i + oldWord.length()).equals(oldWord)) {

                result = result + newWord;   // replace word
                i = i + oldWord.length();    // move index forward
            } else {
                result = result + sentence.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take sentence input
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        // take word to replace
        System.out.println("Enter the word to replace:");
        String oldWord = sc.nextLine();

        // take new word
        System.out.println("Enter the new word:");
        String newWord = sc.nextLine();

        // call replace method
        String modifiedSentence = replaceWord(sentence, oldWord, newWord);

        // print result
        System.out.println("Modified Sentence:");
        System.out.println(modifiedSentence);
    }
}
