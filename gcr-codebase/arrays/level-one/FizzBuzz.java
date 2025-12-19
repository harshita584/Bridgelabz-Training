import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		//Enter the number
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		String arr[] = new String[number+1];
		
		//Saving the Strings in an array
		if(number>0)
		{
			for(int i=0; i<=number; i++)
			{
				if(i%3==0 && i%5==0)
				{
					arr[i] = "Position " + i + " = FizzBuzz" ;
				}
				else if(i%3==0)
				{
					arr[i] = "Position " + i + " = Fizz" ;
				}
				else if(i%5==0)
				{
					arr[i] = "Position " + i + " = Buzz" ;
				}
				else 
				{
					arr[i] = "Position " + i + " = " + i;
				}
				
			}
		}
		
		// Display the results of the array based on the index position
		for(int i=0; i<=number; i++)
		{
			System.out.println(arr[i]);
		}		
	}
}
