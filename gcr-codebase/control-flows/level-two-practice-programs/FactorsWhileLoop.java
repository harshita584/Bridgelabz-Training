// Rewrite the above program 7 to find the factors of a number using the while loop

import java.util.Scanner;

public class FactorsWhileLoop {

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
			int counter = 1;
			while(counter <= number)
			{
				if(number%counter == 0)
				{
					System.out.println(counter);
					counter++;
				}
				else {
					counter++;
				}
			}
		}

	}

}