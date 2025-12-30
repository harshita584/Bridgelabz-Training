import java.util.Scanner;

public class MovieTicket {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        char nextCustomer;

        do {
            int totalBill = 0;

            /* ---------------- Movie Selection ---------------- */
            int movieChoice;
            while (true) {
                System.out.println("\nSelect Movie Genre:");
                System.out.println("1.Action 2.Adventure 3.Comedy 4.Drama 5.Romance");
                System.out.println("6.Thriller 7.Horror 8.Mystery 9.Animation 10.Biopic");

                movieChoice = sc.nextInt();

                if (movieChoice >= 1 && movieChoice <= 10) {
                    break;
                } else {
                    System.out.println("Invalid movie choice. Please select again.");
                }
            }

            switch (movieChoice) {
                case 1 -> System.out.println("You chose Action movie!");
                case 2 -> System.out.println("You chose Adventure movie!");
                case 3 -> System.out.println("You chose Comedy movie!");
                case 4 -> System.out.println("You chose Drama movie!");
                case 5 -> System.out.println("You chose Romance movie!");
                case 6 -> System.out.println("You chose Thriller movie!");
                case 7 -> System.out.println("You chose Horror movie!");
                case 8 -> System.out.println("You chose Mystery movie!");
                case 9 -> System.out.println("You chose Animation movie!");
                case 10 -> System.out.println("You chose Biopic movie!");
            }

            /* ---------------- Seat Selection ---------------- */
            char seatChoice;
            while (true) {
                System.out.println("\nSelect Seat Type:");
                System.out.println("a. Silver (Rs.200)  b. Gold (Rs.250)  c. Platinum (Rs.300)");

                seatChoice = sc.next().toLowerCase().charAt(0);

                if (seatChoice == 'a' || seatChoice == 'b' || seatChoice == 'c') {
                    break;
                } else {
                    System.out.println("Invalid seat choice. Please select again.");
                }
            }

            if (seatChoice == 'a') {
                System.out.println("Silver seat booked.");
                totalBill += 200;
            } else if (seatChoice == 'b') {
                System.out.println("Gold seat booked.");
                totalBill += 250;
            } else {
                System.out.println("Platinum seat booked.");
                totalBill += 300;
            }

            /* ---------------- Snack Selection ---------------- */
            System.out.println("\nDo you want snacks? (y/n)");
            char snackOption = sc.next().toLowerCase().charAt(0);

            if (snackOption == 'y') {
                System.out.println("Select Snacks:");
                System.out.println("1.Popcorn (Rs.100)");
                System.out.println("2.Samosa (Rs.50)");
                System.out.println("3.Beverages (Rs.80)");
                System.out.println("4.Pizza (Rs.150)");
                System.out.println("5.Nachos (Rs.120)");

                int snackChoice = sc.nextInt();

                switch (snackChoice) {
                    case 1 -> { System.out.println("Popcorn added."); totalBill += 100; }
                    case 2 -> { System.out.println("Samosa added."); totalBill += 50; }
                    case 3 -> { System.out.println("Beverages added."); totalBill += 80; }
                    case 4 -> { System.out.println("Pizza added."); totalBill += 150; }
                    case 5 -> { System.out.println("Nachos added."); totalBill += 120; }
                    default -> System.out.println("Invalid snack choice. No snacks added.");
                }
            }

            /* ---------------- Bill Summary ---------------- */
            System.out.println("\n ----- BILL SUMMARY -----");
            System.out.println("Total Amount to Pay: ₹" + totalBill);
            System.out.println("---------------------------");

            /* ---------------- Next Customer ---------------- */
            System.out.println("\nNext customer? (y/n)");
            nextCustomer = sc.next().toLowerCase().charAt(0);

        } while (nextCustomer == 'y');

        System.out.println("\nThank you for using Movie Ticket Booking App!");
        sc.close();
    }
}
