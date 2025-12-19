import java.util.Scanner;

public class MultiDimensional {

	public static void main(String[] args) {
		// Taking number of rows and columns in input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = sc.nextInt();
		
		// Defining the 2D array
		int arr[][] = new int[rows][cols];
		
		// Input the elements in 2D array
		System.out.println("Enter the elements in an array: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("The 2D array is: ");
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int size = rows*cols;
		int arr1D[] = new int[size];
		int index=0;
		
		// Copying the elements of array 2 in array 1
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				arr1D[index++] = arr[i][j];
			}
		}
		
		// Printing the final output
		System.out.println();
		System.out.println("The 1D array is: ");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr1D[i]+" ");
		}
	}

}
