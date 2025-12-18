import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take weight input in kilograms
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        // Take height input in centimeters
        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and status
        System.out.printf("BMI: " + bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
