import java.util.Scanner;

public class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input height and weight
        System.out.print("Enter height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter weight in kilograms: ");
        double weight = scanner.nextDouble();

        // BMI calculation formula: weight / (height * height)
        double bmi = weight / (height * height);

        System.out.println("Your BMI is: " + bmi);

        // Finding BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        scanner.close();
    }
}
