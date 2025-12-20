import java.util.Scanner;

public class StudentGradesUsing2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[][] marks = new int[numberOfStudents][3]; // physics, chemistry, maths
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = scanner.nextInt();
                if (marks[i][j] < 0) {
                    System.out.println("Invalid marks, enter positive values!");
                    j--;
                }
            }
        }

        // calculating percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        // displaying the result
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] +
                               ", Chemistry=" + marks[i][1] +
                               ", Maths=" + marks[i][2] +
                               ", Percentage=" + percentage[i] +
                               "%, Grade=" + grade[i]);
        }

        scanner.close();
    }
}
