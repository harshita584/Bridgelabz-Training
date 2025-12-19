import java.util.Scanner;

public class PositiveNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Defining an array of 10 integers
		int arr[] = new int[5];
	
		// Taking user input
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter the element: " + (i+1)); 
			arr[i] = sc.nextInt();
		}
		
		// Printing whether a number is positive, negative or zero
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > 0)
			{
				if(arr[i]%2==0)
				{
				System.out.println(arr[i] + " is positive and even.");
				}
				else 
				{
					System.out.println(arr[i] + " is positive and odd.");
				}
			}
			else if (arr[i] < 0)
			{
				System.out.println(arr[i] + " is negative.");
			}
			else 
			{
				System.out.println(arr[i] + " is zero.");
			}
		}
		
		System.out.println();
		
		// compare the first and last element of the array and display if they equal, greater or less
		if(arr[0] == arr[arr.length-1])
		{
			System.out.println("The first element " + arr[0] + " and the last element " + arr[arr.length-1] + " are equal.");
		}
		else if (arr[0] > arr[arr.length-1]) 
		{
			System.out.println("The first element " + arr[0] + " is greater than the last element " + arr[arr.length-1] + " .");
		}
		else  
		{
			System.out.println("The first element " + arr[0] + " is smaller than the last element " + arr[arr.length-1] + " .");
		}
		
		
	}

}
