import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        System.out.println("----- Using Multiple if-else Statements -----");

        // Part 1: Multiple if-else statements
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            if (year % 4 != 0) { // Not divisible by 4
                System.out.println(year + " is not a Leap Year.");
            } else {
                if (year % 100 != 0) { // Divisible by 4 but not by 100
                    System.out.println(year + " is a Leap Year.");
                } else {
                    if (year % 400 == 0) { // Divisible by 100 and 400
                        System.out.println(year + " is a Leap Year.");
                    } else { // Divisible by 100 but not by 400
                        System.out.println(year + " is not a Leap Year.");
                    }
                }
            }
        }

        System.out.println("----- Using Single if Statement with Logical Operators -----");

        // Part 2: Single if statement using && and || operators
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close(); // Close the scanner
    }
}
