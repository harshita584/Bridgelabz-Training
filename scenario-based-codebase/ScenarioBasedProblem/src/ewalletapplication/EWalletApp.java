package ewalletapplication;

import java.util.Scanner;

public class EWalletApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---- User 1 creation ----
        System.out.print("Enter User 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Select Wallet Type (1-Personal, 2-Business): ");
        int type1 = sc.nextInt();

        Wallet w1 = (type1 == 1) ? new PersonalWallet() : new BusinessWallet();
        User u1 = new User(1, name1, w1);

        // ---- User 2 creation ----
        sc.nextLine(); // buffer clear
        System.out.print("\nEnter User 2 name: ");
        String name2 = sc.nextLine();

        System.out.print("Select Wallet Type (1-Personal, 2-Business): ");
        int type2 = sc.nextInt();

        Wallet w2 = (type2 == 1) ? new PersonalWallet() : new BusinessWallet();
        User u2 = new User(2, name2, w2);

        int choice;

        do {
            System.out.println("\n====== E-Wallet Menu ======");
            System.out.println("1. Load Money");
            System.out.println("2. Transfer Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Load money to which user (1 or 2): ");
                    int loadUser = sc.nextInt();

                    System.out.print("Enter amount: ");
                    double loadAmount = sc.nextDouble();

                    if (loadUser == 1)
                        u1.getWallet().loadMoney(loadAmount);
                    else
                        u2.getWallet().loadMoney(loadAmount);

                    System.out.println("Money loaded successfully.");
                    break;

                case 2:
                    System.out.print("Transfer from user (1 or 2): ");
                    int from = sc.nextInt();

                    System.out.print("Transfer to user (1 or 2): ");
                    int to = sc.nextInt();

                    System.out.print("Enter amount: ");
                    double amount = sc.nextDouble();

                    if (from == 1 && to == 2)
                        u1.getWallet().transferTo(u2, amount);
                    else if (from == 2 && to == 1)
                        u2.getWallet().transferTo(u1, amount);
                    else
                        System.out.println("Invalid transfer!");

                    break;

                case 3:
                    System.out.println("\nBalances:");
                    System.out.println(u1.getName() + ": ₹" + u1.getWallet().getBalance());
                    System.out.println(u2.getName() + ": ₹" + u2.getWallet().getBalance());
                    break;

                case 4:
                    System.out.print("View transactions of user (1 or 2): ");
                    int tUser = sc.nextInt();

                    if (tUser == 1)
                        u1.getWallet().showTransactions();
                    else
                        u2.getWallet().showTransactions();
                    break;

                case 5:
                    System.out.println("Exiting E-Wallet App 👋");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}
