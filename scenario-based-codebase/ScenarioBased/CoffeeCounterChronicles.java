import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prices of different coffee types
        final double ESPRESSO_PRICE = 100.0;
        final double LATTE_PRICE = 150.0;
        final double CAPPUCCINO_PRICE = 200.0;
        final double GST_RATE = 0.18; // 18% GST

        while (true) {
            System.out.println("\nEnter coffee type (espresso/latte/cappuccino) or type 'exit' to stop:");
            String coffeeType = scanner.nextLine().toLowerCase();

            // Exit condition
            if (coffeeType.equals("exit")) {
                System.out.println("Thank you for visiting Ravi's Café!");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // consume newline

            double pricePerCup = 0.0;

            // Using switch to determine coffee price
            switch (coffeeType) {
                case "espresso":
                    pricePerCup = ESPRESSO_PRICE;
                    break;
                case "latte":
                    pricePerCup = LATTE_PRICE;
                    break;
                case "cappuccino":
                    pricePerCup = CAPPUCCINO_PRICE;
                    break;
                default:
                    System.out.println("Invalid coffee type. Please try again.");
                    continue; // skip to next iteration
            }

            // Calculate total bill
            double totalBill = pricePerCup * quantity;
            double gstAmount = totalBill * GST_RATE;
            double finalBill = totalBill + gstAmount;

            System.out.println("Total Bill (without GST): ₹" + totalBill);
            System.out.println("GST (18%): ₹" + gstAmount);
            System.out.println("Final Bill: ₹" + finalBill);
        }

        scanner.close();
    }
}
