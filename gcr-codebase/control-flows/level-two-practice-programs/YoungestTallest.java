// Program to find the youngest and tallest among Amar, Akbar, and Anthony

import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Taking ages as input
        System.out.println("Enter Amar's age: ");
        int amarAge = sc.nextInt();
        System.out.println("Enter Akbar's age: ");
        int akbarAge = sc.nextInt();
        System.out.println("Enter Anthony's age: ");
        int anthonyAge = sc.nextInt();

        // Taking heights as input
        System.out.println("Enter Amar's Height: ");
        double amarHeight = sc.nextDouble();
        System.out.println("Enter Akbar's Height: ");
        double akbarHeight = sc.nextDouble();
        System.out.println("Enter Anthony's Height: ");
        double anthonyHeight = sc.nextDouble();

        // Determine the youngest
        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Amar is Youngest.");
        } 
        else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Akbar is Youngest.");
        } 
        else {
            System.out.println("Anthony is Youngest.");
        }

        // Determine the tallest
        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Amar is Tallest.");
        } 
        else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Akbar is Tallest.");
        } 
        else {
            System.out.println("Anthony is Tallest.");
        }
    }
}
