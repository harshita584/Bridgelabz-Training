public class UnitConvertor03 {

    // Convert Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Convert Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    // Main method
    public static void main(String[] args) {

        double fahrenheit = 98.6;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 70;
        double gallons = 5;
        double liters = 10;

        System.out.println(fahrenheit + " Fahrenheit = "
                + convertFarhenheitToCelsius(fahrenheit) + " Celsius");

        System.out.println(celsius + " Celsius = "
                + convertCelsiusToFarhenheit(celsius) + " Fahrenheit");

        System.out.println(pounds + " Pounds = "
                + convertPoundsToKilograms(pounds) + " Kilograms");

        System.out.println(kilograms + " Kilograms = "
                + convertKilogramsToPounds(kilograms) + " Pounds");

        System.out.println(gallons + " Gallons = "
                + convertGallonsToLiters(gallons) + " Liters");

        System.out.println(liters + " Liters = "
                + convertLitersToGallons(liters) + " Gallons");
    }
}
