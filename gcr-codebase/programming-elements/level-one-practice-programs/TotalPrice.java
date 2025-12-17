// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.

import java.util.Scanner;
public class TotalPrice{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the unit price of an item: ");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity of an item: ");
        double quantity = sc.nextDouble();
        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        }
}

        
        