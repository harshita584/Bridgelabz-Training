import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and store in 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];

            // Convert height from cm to meters
            double heightM = heightCm / 100;

            // BMI formula
            double bmi = weight / (heightM * heightM);

            data[i][2] = bmi;
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D array: 10 rows, 3 columns (weight, height, BMI)
        double[][] data = new double[10][3];

        // Taking input
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI
        calculateBMI(data);

        // Get BMI status
        String[] status = getBMIStatus(data);

        // Display result
        System.out.println("\n----- BMI Report -----");
        System.out.println("Person\tWeight\tHeight\tBMI\t\tStatus");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.2f\t%s%n",
                    (i + 1),
                    data[i][0],
                    data[i][1],
                    data[i][2],
                    status[i]);
        }

        sc.close();
    }
}
