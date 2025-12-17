// write the DoubleOpt program by taking double values and doing the same operations.

import java.util.Scanner;
public class DoubleOpt{
    public static void main(String args[]){
        double a, b, c, operation1, operation2, operation3, operation4;
       
        //Taking the input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextDouble();
        System.out.println("Enter the value of b : ");
        b = sc.nextDouble();
        System.out.println("Enter the value of c : ");
        c = sc.nextDouble();
 
        // performing the operations
        operation1 = a + (b * c);   // * has higher precedence than +
        operation2 = (a * b) + c;   // * has higher precedence than +
        operation3 = c + (a / b);   // / has higher precedence than +
        operation4 = (a % b) + c;   // % has higher precedence than +

        // Displaying the output
        System.out.println("The results of Int Operations are "
                + operation1 + ", "
                + operation2 + ", "
                + operation3 + ", "
                + operation4);
       }
}