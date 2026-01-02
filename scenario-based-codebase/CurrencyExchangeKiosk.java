import java.util.Scanner;

public class CurrencyExchangeKiosk {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\nCurrency Exchange Kiosk ");

            // Input INR amount
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();

            // Currency options
            System.out.println("Select target currency:");
            System.out.println("1. USD");
            System.out.println("2. EUR");
            System.out.println("3. SAR");
            System.out.println("4. JPY");

            System.out.print("Enter your choice (1-4): ");
            int currency = sc.nextInt();

            double convertedAmount = 0;

            // Currency conversion using switch
            switch (currency) {
                case 1:
                    convertedAmount = inr * 0.0111284845;   // USD
                    System.out.println("Converted amount in USD: " + convertedAmount);
                    break;

                case 2:
                    convertedAmount = inr * 0.0094927865;   // EUR
                    System.out.println("Converted amount in EUR: " + convertedAmount);
                    break;

                case 3:
                    convertedAmount = inr * 0.0417359679;  // SAR
                    System.out.println("Converted amount in SAR: " + convertedAmount);
                    break;

                case 4:
                    convertedAmount = inr * 1.7421;    // JPY
                    System.out.println("Converted amount in JPY: " + convertedAmount);
                    break;

                default:
                    System.out.println(" Invalid currency choice!");
                    choice='y';
                    continue;

            }

            // Repeat option
            System.out.print("\nDo you want another conversion? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nThank you for using Currency Exchange Kiosk!");
        sc.close();
    }
}