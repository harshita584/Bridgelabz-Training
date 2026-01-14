package examproctor;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> studentAnswers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Function to visit a question
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Function to go back to previous question
    public void goBack() {
        if (!navigationStack.isEmpty()) {
            navigationStack.pop();
            if (!navigationStack.isEmpty()) {
                System.out.println("Back to Question: " + navigationStack.peek());
            } else {
                System.out.println("No previous question.");
            }
        }
    }

    // Function to submit an answer
    public void submitAnswer(int questionId, String answer) {
        studentAnswers.put(questionId, answer);
        System.out.println("Answer saved for Question " + questionId);
    }

    // Function to load correct answers
    public void loadCorrectAnswers() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");
    }

    // Function to evaluate exam and calculate score
    public int evaluateScore() {
        int score = 0;

        for (Map.Entry<Integer, String> entry : studentAnswers.entrySet()) {
            int questionId = entry.getKey();
            String studentAnswer = entry.getValue();
            String correctAnswer = correctAnswers.get(questionId);

            if (studentAnswer.equals(correctAnswer)) {
                score++;
            }
        }
        return score;
    }

    // Main function to simulate exam
    public static void main(String[] args) {

        ExamProctor exam = new ExamProctor();
        exam.loadCorrectAnswers();

        // Question navigation
        exam.visitQuestion(1);
        exam.submitAnswer(1, "A");

        exam.visitQuestion(2);
        exam.submitAnswer(2, "C");

        exam.visitQuestion(3);
        exam.submitAnswer(3, "C");

        exam.goBack();

        exam.visitQuestion(4);
        exam.submitAnswer(4, "D");

        // Exam submission
        int finalScore = exam.evaluateScore();
        System.out.println("Final Score: " + finalScore);
    }
}
