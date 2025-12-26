import java.util.Scanner;

public class ResultGenerator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalMarks = 0;
        int subjects = 5;

        System.out.println("Enter marks for 5 subjects:");

        // for-loop to read subject marks
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Subject " + i + ": ");
            int marks = sc.nextInt();
            totalMarks += marks;
        }   

        double average = totalMarks / (double) subjects;
        char grade;

        // Switch case for grade assignment
        switch ((int) average / 10) {
            case 10:
            case 9:
            case 8:
                grade = 'A';
                break;
            case 7:
            case 6:
                grade = 'B';
                break;
            case 5:
            case 4:
                grade = 'C';
                break;
            default:
                grade = 'F';
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
