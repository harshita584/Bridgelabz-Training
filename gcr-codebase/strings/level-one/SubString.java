import java.util.Scanner;
public class SubString {

	// method to create a substring from a string using the charAt() method
	public static String subString(int start, int end, String string)
	{
		String sbString = "";
		for(int i=start; i<end; i++)
		{
			sbString = sbString + string.charAt(i);
		}
		return sbString;
	}
	
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
		
		// taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String string = sc.next();
		
		System.out.println("Enter the starting index: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending index: ");
		int end = sc.nextInt();
		
		// calling both the methods to find subString
		String customResult = subString(start, end, string);
		String builtInResult = string.substring(start, end);
		
		// printing the results of subStrings
		System.out.println("Result using charAt(): " + customResult);
		System.out.println("Result using sustring(): " + builtInResult);
		
		// checking if both the results are same or not
		if(customResult.equals(builtInResult))
		{
			System.out.println("Both Strings are same");
		}
		else 
		{
			System.out.println("Both Strings are not same");
		}
		
		// Taking the String 2 in input
		System.out.println("Enter the String 2: ");
		String string2 = sc.next();
		
		// checking if two strings are equal or not
		boolean isStringEqual = isEqual(string, string2);
		System.out.println("Both the Strings are equal? " + isStringEqual);

		
	}

}
