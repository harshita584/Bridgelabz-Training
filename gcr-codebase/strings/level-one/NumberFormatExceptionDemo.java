import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {
        System.out.println(Integer.parseInt(text));
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
        	System.out.println(Integer.parseInt(text));
        }
          catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String text = sc.next();

        // Calling method that generates exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught in main method.");
        }

        // Calling method that handles exception
        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        sc.close();
    }
}
