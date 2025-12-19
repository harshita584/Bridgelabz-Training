import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking number of persons
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        // Arrays to store height, weight, BMI and status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking height and weight
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter height (in meters): ");
            height[i] = sc.nextDouble();

            System.out.print("Enter weight (in kg): ");
            weight[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + height[i] + " meters");
            System.out.println("Weight : " + weight[i] + " kg");
            System.out.printf("BMI    : ", bmi[i]);
            System.out.println("Status : " + status[i]);
        }
    }
}
