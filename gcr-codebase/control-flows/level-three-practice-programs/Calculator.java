import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for first number
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        // Take input for second number
        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        // Take input for operator
        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        double result; // To store the result

        // Perform calculation based on operator
        switch (op) {
            case "+": // Addition
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-": // Subtraction
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*": // Multiplication
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/": // Division
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default: // Invalid operator
                System.out.println("Invalid Operator");
                break;
        }

        sc.close(); // Close scanner
    }
}
