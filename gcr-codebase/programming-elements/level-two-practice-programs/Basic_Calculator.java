// Write a program to create a basic calculator for addition, subtraction, multiplication, and division. The program should ask for two numbers (floating point) and perform all the operations


import java.util.Scanner;
public class Basic_Calculator{
    public static void main(String args[]){
        double num1, num2;

        // taking input and performing operations
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        num1 = sc.nextDouble();
        System.out.println("Enter number 1: ");
        num2 = sc.nextDouble();
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;

        // Displaying the output
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", " + "and " + division);
    }
}
