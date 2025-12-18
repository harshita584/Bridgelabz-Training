// Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        // Check if the year is before 1582
        if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } 
        // Check leap year using a single if statement with logical operators
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a Leap Year.");
        } 
        else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close(); // Close the scanner
    }
}
