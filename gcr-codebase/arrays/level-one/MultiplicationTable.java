import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		
		// Taking the number input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
                // Defining an integer array
		int table[] = new int[10];
		
		// Storing the results in the multiplication table array
		for(int i=1; i<=10; i++)
		{
			table[i-1] = number*i;
		}
		
		// Display the result from the array
		for(int i=0; i<10; i++)
		{
			System.out.println(number + " * " + (i+1) + " = " + table[i] );
		}		
	}
}
