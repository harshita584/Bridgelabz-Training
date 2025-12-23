import java.util.Scanner;

public class CalendarDisplay {

    // method to get month name
    public static String getMonthName(int month) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month - 1];
    }

    // method to check leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // method to get number of days in month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) return 29;
        return days[month - 1];
    }

    // method to get first day of month using Gregorian algorithm
    public static int getFirstDay(int day, int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31*m0)/12) % 7;
        return d0; // 0=Sunday, 1=Monday...
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDay(1, month, year);

        // displaying calendar
        System.out.println("\nCalendar for " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }

        scanner.close();
    }
}
