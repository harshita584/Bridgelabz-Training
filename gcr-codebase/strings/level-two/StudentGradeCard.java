import java.util.Scanner;

public class StudentGradeCard {

    // Generating random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3];

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 100); // Physics
            scores[i][1] = (int)(Math.random() * 100); // Chemistry
            scores[i][2] = (int)(Math.random() * 100); // Maths
        }
        return scores;
    }

    // Calculating Total, Average and Percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round to 2 decimals
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Calculating Grade
    public static String[] calculateGrade(double[][] result) {
        String[] grades = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B";
            else if (percent >= 60) grades[i] = "C";
            else if (percent >= 50) grades[i] = "D";
            else if (percent >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Printing Scorecard
    public static void displayScoreCard(int[][] scores, double[][] result, String[] grades) {

        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\t\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                scores[i][0] + "\t" +
                scores[i][1] + "\t\t" +
                scores[i][2] + "\t" +
                (int)result[i][0] + "\t" +
                result[i][1] + "\t\t" +
                result[i][2] + "%\t\t" +
                grades[i]
            );
        }
        System.out.println("------------------------------------------------------------------------------------");
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] result = calculateResults(scores);
        String[] grades = calculateGrade(result);

        displayScoreCard(scores, result, grades);
    }
}
