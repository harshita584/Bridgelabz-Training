import java.util.Scanner;

public class BMIUsing2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // 2D array to store height, weight, and BMI
        // Column 0 -> Height, Column 1 -> Weight, Column 2 -> BMI
        double[][] personData = new double[number][3];

        // Array to store weight status
        String[] weightStatus = new String[number];

        // Taking height and weight 
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));

            do {
                System.out.print("Enter height (in meters): ");
                personData[i][0] = sc.nextDouble();
            } while (personData[i][0] <= 0);

            do {
                System.out.print("Enter weight (in kg): ");
                personData[i][1] = sc.nextDouble();
            } while (personData[i][1] <= 0);
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < number; i++) {
            double height = personData[i][0];
            double weight = personData[i][1];

            personData[i][2] = weight / (height * height);

            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying the results
        System.out.println();
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));
            System.out.println("Height : " + personData[i][0] + " meters");
            System.out.println("Weight : " + personData[i][1] + " kg");
            System.out.printf("BMI    : ", personData[i][2]);
            System.out.println("Status : " + weightStatus[i]);
        }
    }
}