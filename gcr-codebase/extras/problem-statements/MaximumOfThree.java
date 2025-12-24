import java.util.Scanner;

public class MaximumOfThree {

    // method to find maximum using logical AND
    public static int findMax(int a, int b, int c) {

        // check if a is greatest
        if (a >= b && a >= c) {
            return a;
        }
        // check if b is greatest
        else if (b >= a && b >= c) {
            return b;
        }
        // otherwise c is greatest
        else {
            return c;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take three numbers as input
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Enter third number:");
        int num3 = sc.nextInt();

        // call method to find maximum
        int max = findMax(num1, num2, num3);

        System.out.println("Maximum number is: " + max);
    }
}
