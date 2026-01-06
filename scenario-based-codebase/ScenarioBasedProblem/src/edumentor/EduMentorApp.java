package edumentor;

public class EduMentorApp {
    public static void main(String[] args) {

        Learner learner = new Learner(
                "Harshita","harsh@email.com","L101","FULL_TIME"
        );

        String[] questions = {
                "What is JVM?","What is OOP?"
        };

        int[] correctAnswers = {1, 2};

        Quiz quiz = new Quiz("MEDIUM", questions, correctAnswers);

        int[] userAnswers = {1, 2};
        quiz.submitAnswers(userAnswers);

        System.out.println("Score: " + quiz.getScore());
        System.out.println("Percentage: " + quiz.calculatePercentage());

        learner.generateCertificate();
    }
}

