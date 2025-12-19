import java.util.Scanner;

public class AddingElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double arr[] = new double[10];
		double total = 0.0;
		int i=0;
		while(true)
		{
			System.out.println("Enter the element in an array: ");
			double num = sc.nextDouble();
			if(num<0 || num==0)
			{
				break;
			}
			else 
			{
				arr[i] = num;
				i++;
				if(i==10)
				{
					break;
				}
			}
			
		}
		
		// Printing the elements in an array and adding the elements
		for(int j=0; j<i; j++)
		{
			System.out.println(arr[j]);
			total += arr[j];
		}
		System.out.println();
		// Printing the sum
		System.out.println("The sum of all numbers is: " + total);
	}

}
