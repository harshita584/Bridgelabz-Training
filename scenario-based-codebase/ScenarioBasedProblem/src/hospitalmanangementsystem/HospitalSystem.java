package hospitalmanangementsystem;

import java.util.Scanner;

public class HospitalSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ----- Doctor input -----
        System.out.print("Enter Doctor ID: ");
        int dId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Doctor Name: ");
        String dName = sc.nextLine();

        System.out.print("Enter Specialization: ");
        String spec = sc.nextLine();

        Doctor doctor = new Doctor(dId, dName, spec);

        // ----- Patient input -----
        System.out.println("\nEnter InPatient details");
        System.out.print("Patient ID: ");
        int ipId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String ipName = sc.nextLine();

        System.out.print("Medical History: ");
        String history = sc.nextLine();

        System.out.print("Number of Days: ");
        int days = sc.nextInt();

        System.out.print("Daily Charge: ");
        double dailyCharge = sc.nextDouble();

        Patient inPatient = new InPatient(ipId, ipName, history, days, dailyCharge);

        System.out.println("\nEnter OutPatient details");
        System.out.print("Patient ID: ");
        int opId = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String opName = sc.nextLine();

        System.out.print("Consultation Fee: ");
        double fee = sc.nextDouble();

        Patient outPatient = new OutPatient(opId, opName, fee);

        // Assign doctor
        inPatient.assignDoctor(doctor);
        outPatient.assignDoctor(doctor);

        int choice;

        do {
            System.out.println("\n===== Hospital Menu =====");
            System.out.println("1. Show Patient Details");
            System.out.println("2. Show Doctor Details");
            System.out.println("3. Generate Bills");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Patient Details ---");
                    inPatient.displayInfo();
                    outPatient.displayInfo();
                    break;

                case 2:
                    System.out.println("\n--- Doctor Details ---");
                    doctor.displayInfo();
                    break;

                case 3:
                    Bill bill1 = new Bill(((InPatient) inPatient).getCost());
                    Bill bill2 = new Bill(((OutPatient) outPatient).getCost());

                    System.out.println("\nFinal Bill (" + ipName + " - InPatient): ₹" + bill1.calculatePayment());
                    System.out.println("Final Bill (" + opName + " - OutPatient): ₹" + bill2.calculatePayment());
                    break;

                case 4:
                    System.out.println("Exiting Hospital Management System 👋");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
