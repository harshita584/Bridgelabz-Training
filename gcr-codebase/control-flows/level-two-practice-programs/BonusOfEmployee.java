// Program to calculate bonus based on employee's years of service

import java.util.Scanner;
public class BonusOfEmployee {
    public static void main(String args[]) {
        int bonus = 5, yearsOfService, salary, bonusAmount;

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee salary: ");
        salary = sc.nextInt();

        System.out.println("Enter the employee's years of service: ");
        yearsOfService = sc.nextInt();

        // Check eligibility for bonus
        if (yearsOfService > 5) {

            // Calculate 5% bonus
            bonusAmount = (salary / 100) * bonus;

            System.out.println("The bonus amount is " + bonusAmount);
        } 
        else {
            System.out.println("Bonus is not provided.");
        }
    }
}
