import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM marks for students
    public static int[][] generatePCMMarks(int students) {
        int[][] marks = new int[students][3]; // 0-Physics, 1-Chemistry, 2-Maths

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                // random 2-digit number (10 to 99)
                marks[i][j] = (int)(Math.random() * 90) + 10;
            }
        }
        return marks;
    }

    // Method to calculate total, average and percentage
    // Returns 2D array: total, average, percentage
    public static double[][] calculateResults(int[][] marks) {
        int students = marks.length;
        double[][] result = new double[students][3];

        for (int i = 0; i < students; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // rounding to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] marks, double[][] result) {
        System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t\t" +
                marks[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int[][] marks = generatePCMMarks(students);
        double[][] result = calculateResults(marks);
        displayScoreCard(marks, result);

        sc.close();
    }
}

