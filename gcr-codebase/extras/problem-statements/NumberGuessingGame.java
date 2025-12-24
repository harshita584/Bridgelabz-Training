import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // method to generate a random guess
    public static int generateGuess(int low, int high) {
        Random r = new Random();
        return r.nextInt(high - low + 1) + low;
    }

    // method to get user feedback
    public static String getFeedback(Scanner sc) {
        System.out.println("Enter feedback (high / low / correct):");
        return sc.nextLine();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean isGuessed = false;

        System.out.println("Think of a number between 1 and 100.");

        while (!isGuessed) {

            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);

            String feedback = getFeedback(sc);

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            }
            else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
            else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Computer guessed the number correctly!");
                isGuessed = true;
            }
        }
    }
}
