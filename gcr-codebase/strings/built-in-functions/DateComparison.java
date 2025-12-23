import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // first date input
        System.out.println("Enter first date (yyyy-mm-dd):");
        LocalDate date1 = LocalDate.parse(sc.nextLine());

        // second date input
        System.out.println("Enter second date (yyyy-mm-dd):");
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // compare dates
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date");
        }
        else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date");
        }
        else {
            System.out.println("Both dates are the same");
        }
    }
}
