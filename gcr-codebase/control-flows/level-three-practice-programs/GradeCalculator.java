import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double maths = sc.nextDouble();

        // Compute total and percentage
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100; // Each subject out of 100

        // Initialize grade and remark variables
        String grade;
        String remark;

        // Determine grade and remark based on percentage
        if (percentage >= 80) {
            grade = "A";
            remark = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remark = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remark = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remark = "Level 1, well below agency-normalized student";
        } else if (percentage >= 40) {
            grade = "E";
            remark = "Level 1, too below agency-normalized student";
        } else {
            grade = "R";
            remark = "Remedial standards";
        }

        // Display the results
        System.out.println("Result: ");
        System.out.printf("Average Marks: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remark: " + remark);

        sc.close(); // Close the scanner
    }
}
