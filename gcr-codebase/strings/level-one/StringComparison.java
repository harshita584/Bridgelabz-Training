import java.util.Scanner;
public class StringComparison {
	
        // method to compare two strings using the charAt() method
	public static boolean isEqual(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
                // Taking input from the user
		Scanner	sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String str1 = sc.nextLine();
		System.out.println("Enter the second String: ");
		String str2 = sc.nextLine();
		
                // calling the method
		boolean isStringEqual = isEqual(str1, str2);

                // Using the String Built-In method to check if the results are the same and display the result 
		if(isStringEqual == str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both String 1 and String 2 are equal.");
			System.out.println("Both methods give the same result.");
		}
		else 
		{
			System.out.println("Both String 1 and String 2 are not equal.");
		}
	}
}
