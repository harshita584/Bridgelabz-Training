import java.util.Scanner;

public class LeapYear {

    // Method to check leap year
    static boolean isLeapYear(int year) {

        // Condition for Leap Year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Invalid year..!! Leap year concept only works after Year:1582.");
        } else {

            if (isLeapYear(year)) {
                System.out.println("Year " + year + " is a Leap Year.");
            } else {
                System.out.println("Year " + year + " is NOT a Leap Year.");
            }
        }
    }
}
