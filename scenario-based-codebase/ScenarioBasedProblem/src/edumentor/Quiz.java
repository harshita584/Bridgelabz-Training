package edumentor;

public class Quiz {

    private String[] questions;        // internal question bank
    private final int[] correctAnswers; // cannot be modified
    private int score;
    private String difficulty;

    // Constructor overloading
    public Quiz(String difficulty, String[] questions, int[] correctAnswers) {
        this.difficulty = difficulty;
        this.questions = questions;
        this.correctAnswers = correctAnswers;
    }

    public void submitAnswers(int[] userAnswers) {
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers[i] == correctAnswers[i]) {
                score++; // operator usage
            }
        }
    }

    public double calculatePercentage() {
        return (score * 100.0) / correctAnswers.length;
    }

    public int getScore() {
        return score;
    }
}

