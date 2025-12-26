import java.util.Scanner;

public class MetroSmartCard {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = 100.0; // initial balance
        char choice;

        do {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance travelled (in km): ");
            int distance = sc.nextInt();

            // Fare calculation using ternary operator
            double fare = (distance <= 5) ? 10 : 20;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare Deducted: ₹" + fare);
                System.out.println("Remaining Balance: ₹" + balance);
            } else {
                System.out.println("Insufficient balance. Please recharge.");
                break;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Delhi Metro 🚇");
        sc.close();
    }
}
