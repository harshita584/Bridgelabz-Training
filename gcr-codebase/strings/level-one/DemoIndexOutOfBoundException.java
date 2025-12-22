import java.util.Scanner;
public class DemoIndexOutOfBoundException {

	// Method to generate the Exception
	public static void generateException(String string)
	{
		System.out.println(string.charAt(string.length()+1));
	}
	
	// Method to demonstrate StringIndexOutOfBoundsException
	public static void demonstrateException(String string)
	{
		try {
			System.out.println(string.charAt(string.length()+1));
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Handled exception successfully.");
		}
		
	}
	
	public static void main(String[] args) {
		String string;
		Scanner  sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		string = sc.nextLine();
		
		// calling the method to generate the Exception
		try {
			generateException(string);
		}
		// calling the method to handle the RuntimeException
		catch (IndexOutOfBoundsException e){
			demonstrateException(string);
		}
	}
}
