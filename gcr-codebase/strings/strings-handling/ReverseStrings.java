import java.util.Scanner;
public class ReverseStrings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    // Taking input
	    System.out.print("Enter a string: ");
	    String text = sc.nextLine();
	
		// empty string to add characters
		String rev = "";
		
		for(int i=text.length()-1; i>=0; i--)
		{
			rev = rev + text.charAt(i);
		}
		
		// printing the reverse string
		System.out.println(rev);
	}
}