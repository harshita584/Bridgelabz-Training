/* Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. */ 


import java.util.Scanner;
public class IntOperation{
    public static void main(String args[]){
        int a, b, c, operation1, operation2, operation3, operation4;
       
        //Taking the input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        b = sc.nextInt();
        System.out.println("Enter the value of c : ");
        c = sc.nextInt();
 
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