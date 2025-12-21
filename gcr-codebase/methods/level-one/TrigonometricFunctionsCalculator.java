import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    // method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double[] results = new double[3];
        results[0] = Math.sin(radians);   // sine
        results[1] = Math.cos(radians);   // cosine
        results[2] = Math.tan(radians);   // tangent
        return results;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking inputs from the user
        System.out.print("Enter angle in degrees: ");
        double angle = scanner.nextDouble();

        // calculating trigonometric functions
        double[] trigResults = calculateTrigonometricFunctions(angle);

        // displaying the result
        System.out.println("Sine(" + angle + ") = " + trigResults[0]);
        System.out.println("Cosine(" + angle + ") = " + trigResults[1]);
        System.out.println("Tangent(" + angle + ") = " + trigResults[2]);

        scanner.close();
    }
}
