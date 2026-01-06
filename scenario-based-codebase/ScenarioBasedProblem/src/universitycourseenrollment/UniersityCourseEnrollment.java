package universitycourseenrollment;

import java.util.Scanner;

public class UniersityCourseEnrollment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== COURSES AVAILABLE =====
        Course c1 = new Course("CS101", "Data Structures");
        Course c2 = new Course("CS201", "Advanced Algorithms");

        System.out.println("Available Courses:");
        System.out.println("1. " + c1.getCourseName());
        System.out.println("2. " + c2.getCourseName());

        // ===== STUDENT 1 INPUT =====
        System.out.print("\nEnter Student Name: ");
        String name1 = sc.nextLine();

        System.out.print("Select Student Type (1-UG / 2-PG): ");
        int type1 = sc.nextInt();
        sc.nextLine();

        Student s1;
        if (type1 == 1) {
            System.out.print("Enter elective preference: ");
            String elective = sc.nextLine();
            s1 = new Undergraduate(101, name1, elective);
        } else {
            s1 = new Postgraduate(101, name1);
        }

        System.out.print("Choose course (1 or 2): ");
        int courseChoice1 = sc.nextInt();
        Enrollment e1 = new Enrollment(s1, courseChoice1 == 1 ? c1 : c2);

        // ===== STUDENT 2 INPUT =====
        sc.nextLine();
        System.out.print("\nEnter Student Name: ");
        String name2 = sc.nextLine();

        System.out.print("Select Student Type (1-UG / 2-PG): ");
        int type2 = sc.nextInt();
        sc.nextLine();

        Student s2;
        if (type2 == 1) {
            System.out.print("Enter elective preference: ");
            String elective = sc.nextLine();
            s2 = new Undergraduate(102, name2, elective);
        } else {
            s2 = new Postgraduate(102, name2);
        }

        System.out.print("Choose course (1 or 2): ");
        int courseChoice2 = sc.nextInt();
        Enrollment e2 = new Enrollment(s2, courseChoice2 == 1 ? c1 : c2);

        Faculty faculty = new Faculty("Dr. Ojha");

        int choice;

        do {
            System.out.println("\n===== University Menu =====");
            System.out.println("1. Assign Letter Grade");
            System.out.println("2. Assign Pass/Fail Grade");
            System.out.println("3. View Transcripts");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Select Student: 1." + s1.name + "  2." + s2.name);
                    int lg = sc.nextInt();
                    System.out.print("Enter score: ");
                    double score = sc.nextDouble();

                    if (lg == 1)
                        faculty.assignLetterGrade(e1, score);
                    else
                        faculty.assignLetterGrade(e2, score);
                    break;

                case 2:
                    System.out.println("Select Student: 1." + s1.name + "  2." + s2.name);
                    int pf = sc.nextInt();
                    System.out.print("Enter score: ");
                    double pfScore = sc.nextDouble();

                    if (pf == 1)
                        faculty.assignPassFailGrade(e1, pfScore);
                    else
                        faculty.assignPassFailGrade(e2, pfScore);
                    break;

                case 3:
                    System.out.println("\n--- Transcripts ---");
                    System.out.println(s1.getTranscript());
                    System.out.println(s2.getTranscript());
                    break;

                case 4:
                    System.out.println("System Closed 👋");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (choice != 4);

        sc.close();
    }
}
