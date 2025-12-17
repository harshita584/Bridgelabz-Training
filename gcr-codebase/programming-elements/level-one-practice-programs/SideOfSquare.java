// Write a program to find the side of the square whose parameter you read from user 

import java.util.Scanner;
public class SideOfSquare{
    public static void main(String args[]){
        int side, perimeter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the perimeter of a Square: ");
        perimeter = sc.nextInt();
        side = perimeter / 4;
         
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
}


     