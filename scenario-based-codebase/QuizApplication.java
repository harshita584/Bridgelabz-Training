import java.util.Scanner;

public class OnlineQuizApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Questions
        String[] questions = {
                "1. Which keyword is used to inherit a class in Java?",
                "2. Which loop is guaranteed to execute at least once?",
                "3. Which data type is used to store decimal values?",
                "4. Which symbol is used for logical AND?",
                "5. Which method is the entry point of a Java program?"
        };

        // Options
        String[][] options = {
                {"a) implement", "b) extends", "c) inherits", "d) super"},
                {"a) for", "b) while", "c) for-each", "d) do-while"},
                {"a) int", "b) double", "c) char", "d) boolean"},
                {"a) &&", "b) |", "c) &", "d) !"},
                {"a) start()", "b) run()", "c) main()", "d) init()"}
        };

        // Correct answers
        char[] answers = {'b', 'd', 'b', 'a', 'c'};

        int score = 0;

        System.out.println(" Online Quiz Application");
        System.out.println("---------------------------");

        // Quiz loop
        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = scanner.next().charAt(0);

            // Answer checking using switch
            switch (userAnswer) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userAnswer == answers[i]) {
                        System.out.println("Correct Answer!");
                        score++;
                    } else {
                        System.out.println("Wrong Answer!");
                    }
                    break;

                default:
                    System.out.println("Invalid option!");
                    i--;
            }
        }

        System.out.println("\n Final Score: " + score + " / " + questions.length);
        scanner.close();
    }
}