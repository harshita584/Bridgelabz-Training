import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text, int start, int end) {

        if (start > end) {
            throw new IllegalArgumentException(
                "Start index cannot be greater than end index");
        }

        // This line will not execute
        System.out.println(text.substring(start, end));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text, int start, int end) {

        try {
            if (start > end) {
                throw new IllegalArgumentException(
                    "Start index cannot be greater than end index");
            }

            System.out.println(text.substring(start, end));

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled: " + e.getMessage());

        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String text = sc.next();

        System.out.println("Enter start index:");
        int start = sc.nextInt();

        System.out.println("Enter end index:");
        int end = sc.nextInt();

        // Calling method that generates exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught in main method.");
        }

        // Calling method that handles exception
        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text, start, end);

        sc.close();
    }
}
