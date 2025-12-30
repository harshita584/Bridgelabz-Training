/*
 School Bus Attendance System
 • Track attendance of 10 students
 • Use for-each loop on names
 • Ask "Present or Absent?"
 • Print total present and absent counts
*/

import java.util.Scanner;

public class Attendance {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Array to store student names
        String[] students = new String[10];

        // Variables to count present and absent students
        int presentCount = 0;
        int absentCount = 0;

        // Take student names as input
        for (int i = 0; i < students.length; i++) {
            System.out.print("Enter the name of Student " + (i + 1) + ": ");
            students[i] = sc.next();
        }

        System.out.println("\nAttendance Marking");

        // Mark attendance using for-each loop
        for (String s : students) {

            System.out.println("Attendance for student: " + s);
            System.out.print("Enter status (P for Present, A for Absent): ");

            char ch = sc.next().charAt(0);

            switch (ch) {
                case 'P':
                case 'p':
                    presentCount++;
                    break;

                case 'A':
                case 'a':
                    absentCount++;
                    break;

                default:
                    System.out.println("Invalid input! Counting as Absent.");
                    absentCount++;
            }
        }

        //Display final counts
        System.out.println("Total Present Students: " + presentCount);
        System.out.println("Total Absent Students: " + absentCount);

        sc.close();
    }
}