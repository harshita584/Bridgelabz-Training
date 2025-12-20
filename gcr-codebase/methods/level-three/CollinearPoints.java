import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean isCollinearBySlope(
        double x1, double y1,
        double x2, double y2,
        double x3, double y3) {

    // Check to avoid division by zero
    if ((x2 - x1) == 0 || (x3 - x2) == 0 || (x3 - x1) == 0) {
        return false;
    }

    double slopeAB = (y2 - y1) / (x2 - x1);
    double slopeBC = (y3 - y2) / (x3 - x2);
    double slopeAC = (y3 - y1) / (x3 - x1);

    if (slopeAB == slopeBC && slopeBC == slopeAC) {
        return true;
    } else {
        return false;
    }
}


    // Method to check collinearity using area of triangle formula
    public static boolean isCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        return area == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        // Check using slope method
        boolean slopeResult = isCollinearBySlope(x1, y1, x2, y2, x3, y3);

        // Check using area method
        boolean areaResult = isCollinearByArea(x1, y1, x2, y2, x3, y3);

        // Display result
        System.out.println("\nUsing Slope Method: " +
                (slopeResult ? "Points are Collinear" : "Points are NOT Collinear"));

        System.out.println("Using Area Method: " +
                (areaResult ? "Points are Collinear" : "Points are NOT Collinear"));

        sc.close();
    }
}
