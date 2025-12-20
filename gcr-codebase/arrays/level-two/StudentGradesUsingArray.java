import java.util.Scanner;

public class StudentGradesUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[] physics = new int[numberOfStudents];
        int[] chemistry = new int[numberOfStudents];
        int[] maths = new int[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1));
            System.out.print("Physics: ");
            int p = scanner.nextInt();
            System.out.print("Chemistry: ");
            int c = scanner.nextInt();
            System.out.print("Maths: ");
            int m = scanner.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks, enter positive values!");
                i--;
                continue;
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        // calculating percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentage[i] >= 90) grade[i] = "A";
            else if (percentage[i] >= 75) grade[i] = "B";
            else if (percentage[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }

        // displaying the result
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] +
                               ", Chemistry=" + chemistry[i] +
                               ", Maths=" + maths[i] +
                               ", Percentage=" + percentage[i] +
                               "%, Grade=" + grade[i]);
        }

        scanner.close();
    }
}
