import java.util.Scanner;

public class LineMath {

    // Method to find Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    // Method to find slope and y-intercept
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        double[] result = new double[2];
        result[0] = m;
        result[1] = b;

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance = " + distance);

        // Line equation
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
    }
}
