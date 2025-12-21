import java.util.Scanner;

public class WindChillCalculator {

    // method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature,windSpeed;

        // taking inputs from the user
        System.out.print("Enter temperature (in Fahrenheit): ");
        temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        windSpeed = scanner.nextDouble();

        // calculating wind chill temperature
        double windChill = calculateWindChill(temperature, windSpeed);

        // displaying the result
        System.out.println("Wind Chill Temperature = " + windChill);

        scanner.close();
    }
}
