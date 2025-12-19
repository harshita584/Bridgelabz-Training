import java.util.Scanner;

public class MultiplicationResult {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		// defining an array to store 4 multiplication result
		int arr[] = new int[4];
		// calculating the multiplication result and storing it in variable
		for(int i=6,j=0; i<=9; i++,j++)
		{
			int multiplicationResult = number*i;
			arr[j] = multiplicationResult;
		}
		
		// display the result from the array
		int index=0;
		for(int i=6; i<=9; i++)
		{
			System.out.println(number + " * " + i + " = " + arr[index++]);
		}		
	}
}