// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters 

import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String args[]){
        double base, height, areaOfTriangle, baseInInches, heightInInches, areaInInches;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of a triangle in centimeter: ");
        base = sc.nextDouble();
        System.out.println("Enter the height of a triangle in centimeter: ");
        height = sc.nextDouble();
        // Area in square centimeters
        areaOfTriangle = 0.5 * base * height;
        // Convert cm to inches
        baseInInches = base / 2.54;
        heightInInches = height / 2.54;
        // Area in square inches
        areaInInches = 0.5 * baseInInches * heightInInches;

        //Displaying the output
        System.out.println("The base in centimeter is " + base + " and the height in centimeter is " + height + " and the area of triangle in centimeters is " + areaOfTriangle);
        System.out.println("The base in inches is " +  baseInInches + " and the height in inches is " + heightInInches + " and the area of triangle in inches is " + areaInInches);
        }
}

        
        
        
    
