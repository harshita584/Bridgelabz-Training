import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Rohan's Library Reminder App");

        System.out.print("Enter number of books: ");
        int numberOfBooks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        int totalFine = 0;

        for (int book = 1; book <= numberOfBooks; book++) {

            System.out.println("\nBook " + book);

            LocalDate dueDate;
            LocalDate returnDate;

            while (true) {
                try {
                    System.out.print("Enter Due Date (dd-MM-yyyy): ");
                    String dueInput = scanner.nextLine();
                    dueDate = LocalDate.parse(dueInput, formatter);

                    System.out.print("Enter Return Date (dd-MM-yyyy): ");
                    String returnInput = scanner.nextLine();
                    returnDate = LocalDate.parse(returnInput, formatter);

                    break; // valid input → exit retry loop

                } catch (DateTimeParseException e) {
                    System.out.println(" Invalid date format! Please enter again.");
                    System.out.println(" Correct format: dd-MM-yyyy (example: 15-08-2025)");
                }
            }

            int fine = 0;

            if (returnDate.isAfter(dueDate)) {
                long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
                fine = (int) lateDays * 5;
                System.out.println(" Returned Late by " + lateDays + " days");
            } else {
                System.out.println(" Returned on time");
            }

            System.out.println("Fine for this book: Rs." + fine);
            totalFine += fine;
        }

        System.out.println("\n Total Fine for all books: Rs." + totalFine);
        scanner.close();
    }
}