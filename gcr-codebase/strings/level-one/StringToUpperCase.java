import java.util.Scanner;
public class StringToUpperCase {

	// method using the String built-in charAt() method
	public static String convertToUpperCase(String string)
	{
		String stringUpper = "";
		for(int i=0; i<string.length(); i++)
		{
			int c = string.charAt(i);
			if(c>=65 && c<=90)
			{
				stringUpper += string.charAt(i);
			}
			else {
				char ch = (char) (c-32);
				stringUpper += ch;
			}
		}
		return stringUpper;
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
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String in lowercase: ");
		String string = sc.nextLine();
		
		// calling the methods
	    String resultString = convertToUpperCase(string);
	    String builtString = string.toUpperCase();
	    // Displaying the result of both methods
	    System.out.println("The UpperCase String using custom method   : " + resultString);
	    System.out.println("The UpperCase String using built-in method : " + builtString);
	    
	    // Comparing the methods
	    System.out.println("\nComparing both the methods of converting string to uppercase: ");
	    if(resultString.equals(builtString))
	    {
	    	System.out.println("The results are same.");
	    }
	    else {
			System.out.println("Result is different.");
		}
	    
	    System.out.println("\nEnter String two: ");
	    String string2 = sc.nextLine();
	    
	    // Checking if both string are equal or not
	    boolean isStringEqual = isEqual(string, string2 );
	    System.out.println("Is both Strings equal? " + isStringEqual);

	}

}
