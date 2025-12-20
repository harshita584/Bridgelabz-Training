import java.util.Scanner;

public class BMICalculationUsing2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();
        double[][] personData = new double[numberOfPersons][3]; // weight, height, BMI
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter weight of person " + (i + 1) + ": ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height of person " + (i + 1) + ": ");
            double height = scanner.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input, enter positive values!");
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height/100;
        }

        // calculating BMI and weight status
        for (int i = 0; i < numberOfPersons; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            double bmi = personData[i][2];
            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi <=24.9) weightStatus[i] = "Normal";
            else if (bmi <=39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        // displaying the result
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Person " + (i + 1) + ": Height=" + personData[i][1] +
                               ", Weight=" + personData[i][0] +
                               ", BMI=" + personData[i][2] +
                               ", Status=" + weightStatus[i]);
        }

        scanner.close();
    }
}