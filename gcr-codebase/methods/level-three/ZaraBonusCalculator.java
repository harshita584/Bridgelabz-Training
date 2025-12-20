import java.util.Random;

public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {

            // Generate 5-digit salary (10000 to 99999)
            data[i][0] = 10000 + Math.random() * 90000;

            // Generate years of service (1 to 10)
            data[i][1] = 1 + (int)(Math.random() * 10);
        }

        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → New Salary, Column 1 → Bonus
    public static double[][] calculateBonus(double[][] employeeData) {

        double[][] result = new double[employeeData.length][2];

        for (int i = 0; i < employeeData.length; i++) {

            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            result[i][0] = salary + bonus; // new salary
            result[i][1] = bonus;          // bonus
        }

        return result;
    }

    // Method to calculate totals and display output in tabular format
    public static void displaySummary(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("---------------------------------------------------------");
        System.out.println("Emp | Old Salary | Years | Bonus | New Salary");
        System.out.println("---------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {

            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%3d | %10.2f | %5.0f | %7.2f | %10.2f%n",
                    (i + 1), oldSalary, years, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------");
        System.out.printf("TOTAL OLD SALARY : %.2f%n", totalOldSalary);
        System.out.printf("TOTAL BONUS      : %.2f%n", totalBonus);
        System.out.printf("TOTAL NEW SALARY : %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {

        int employees = 10;

        // Step 1: Generate salary and years of service
        double[][] employeeData = generateEmployeeData(employees);

        // Step 2: Calculate bonus and new salary
        double[][] newSalaryData = calculateBonus(employeeData);

        // Step 3: Display summary
        displaySummary(employeeData, newSalaryData);
    }
}
