import java.util.Scanner;
public class ZaraBonusCalculator {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

        // Arrays to store data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables for totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Taking Input loop
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validation of values
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter valid values.");
                i--; // repeat the same employee
            }
        }

        // Calculation loop
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Printing Output
        System.out.println();
        System.out.println("Total Old Salary of Employees: INR " + totalOldSalary);
        System.out.println("Total Bonus Paid by Company: INR " + totalBonus);
        System.out.println("Total New Salary of Employees: INR " + totalNewSalary);

	}

}
