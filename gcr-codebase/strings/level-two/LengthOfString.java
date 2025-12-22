import java.util.Scanner;
public class LengthOfString {
	
	// method to find and return a string's length
	public static int lengthOfString(String text)
	{
		int count=0, i =0;
		try {
			while(true)
			{
			  text.charAt(i);
			  count++;
			  i++;
			 
			}
		} catch (RuntimeException e) {
			System.out.println("Runtime Exception Occurred");
			return count;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String text = sc.next();
		
		// calling the methods
		int customResult = lengthOfString(text);
		int builtInResult = text.length();
		// Displaying the results
		System.out.println("The length of a String with custom method is: " + customResult);
		System.out.println("The length of a String with built-in method is: " + builtInResult);
		
		// comparing the results
		if(customResult == builtInResult)
		{
			System.out.println("Results are same.");
		}
		else {
			System.out.println("Results are different.");
		}
	}

}
