import java.util.Scanner;
public class EvenOddArray {

	public static void main(String[] args) {
		
		//Taking the number input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		// checking for the valid input
		if(number<=0)
		{
			System.out.println("Invalid Input.");
			return;
		}
		
		// calculating the size for even and odd arrays
	        int size = number/2 + 1;
		int even[] = new int[size];
		int odd[] = new int[size];
		int evenIndex=0;
		int oddIndex=0;
		// Inserting elements in array based on even and odd
		for(int i=1; i<=number; i++)
		{
			if(i%2==0)
			{
				even[evenIndex++] = i;
			}
			else {
				odd[oddIndex++] = i;
			}
		}
		
		//Printing both the arrays
		System.out.println("Printing array of even numbers: ");
		for(int i=0; i<evenIndex; i++)
		{
			System.out.print(even[i] + " ");
		}
		
		System.out.println("\nPrinting array of odd numbers: ");
		for(int i=0; i<oddIndex; i++)
		{
			System.out.print(odd[i] + " ");
		}

	}

}
