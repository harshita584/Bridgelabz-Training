// Create a program to find the factors of a number taken as user input.

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		if(number<0)
		{
			System.out.println("Invalid Input.");
			return;
		}
		else {
			for(int i=1; i<=number; i++)
			{
				if(number%i == 0)
				{
					System.out.println(i);
				}
			}
		}

	}

}