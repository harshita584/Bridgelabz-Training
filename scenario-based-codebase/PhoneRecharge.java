/*Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.*/
      
import java.util.Scanner;

public class PhoneRecharge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {

            // Operator menu
            System.out.println("\nEnter the operator of your choice:");
            System.out.println("1. Jio Offer");
            System.out.println("2. Airtel Dhamaka");
            System.out.println("3. VI Unlimited");
            System.out.println("4. BSNL Family Plan");

            int mobileOperator = sc.nextInt();

            switch (mobileOperator) {

                case 1 -> {
                    System.out.println("Available Jio Offers: 150 | 350 | 600");
                    System.out.print("Enter the amount to recharge: ");
                    int amount = sc.nextInt();

                    if (amount == 150 || amount == 350 || amount == 600) {
                        balance += amount;
                        System.out.println("Jio recharge successful.");
                    } else {
                        System.out.println("Invalid recharge amount.");
                    }
                }

                case 2 -> {
                    System.out.println("Available Airtel Offers: 150 | 350 | 600");
                    System.out.print("Enter the amount to recharge: ");
                    int amount = sc.nextInt();

                    if (amount == 150 || amount == 350 || amount == 600) {
                        balance += amount;
                        System.out.println("Airtel recharge successful.");
                    } else {
                        System.out.println("Invalid recharge amount.");
                    }
                }

                case 3 -> {
                    System.out.println("Available VI Offers: 150 | 350 | 600");
                    System.out.print("Enter the amount to recharge: ");
                    int amount = sc.nextInt();

                    if (amount == 150 || amount == 350 || amount == 600) {
                        balance += amount;
                        System.out.println("VI recharge successful.");
                    } else {
                        System.out.println("Invalid recharge amount.");
                    }
                }

                case 4 -> {
                    System.out.println("Available BSNL Offers: 150 | 350 | 600");
                    System.out.print("Enter the amount to recharge: ");
                    int amount = sc.nextInt();

                    if (amount == 150 || amount == 350 || amount == 600) {
                        balance += amount;
                        System.out.println("BSNL recharge successful.");
                    } else {
                        System.out.println("Invalid recharge amount.");
                    }
                }

                default -> System.out.println("Invalid operator selection.");
            }

            // Recharge summary
            System.out.println("Current balance: " + balance);
            System.out.print("Do you want to recharge again? (yes/no): ");

            String choice = sc.next().toLowerCase();
            if (!choice.equals("yes")) {
                break; // exit while loop
            }
        }

        sc.close();
        System.out.println("Thank you for using Phone Recharge Simulator.");
    }
}
