import java.util.Scanner;
public class NumberCheckerFive extends NumberCheckerExtends{

	// Method to Check if a number is prime number
	public static boolean isPrime(int number)
	{
		boolean flag = true;
		for(int i=2; i<=Math.sqrt(number); i++)
		{
			if(number%i == 0)
			{
				flag = false;
				return flag;
			}
		}
		return true;
	}
	
	// Method to Check if a number is a neon number
	public static boolean isNeon(int number, int[] digits)
	{
		int sum = sumOfSquaresOfDigits(digits);
		return number == sum;
		
	}
	
	// Method to find the product of digit of number
	public static int product(int[] digit)
	{
		int productOfDigits = 1;
		for(int i=0; i<digit.length; i++)
		{
			productOfDigits *= digit[i];
		}
		return productOfDigits;
	}
	
	// Method to Check if a number is a spy number
	public static boolean isSpy(int number, int[] digit)
	{
		int sum = sumOfDigits(digit);
		int products = product(digit);
		return products == sum;
		
	}
	
	// Method to Check if a number is an automorphic number
	public static boolean isAutomorphic(int number)
	{
		    int square = number * number;
		    int lastDigits = square % 10;
		    return lastDigits == number;
	}
	
	//Method to Check if a number is a buzz number
	public static boolean isBuzz(int number)
	{
		int lastDigits = number % 10;
		return lastDigits==7 || number%7==0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int[] digits = storeDigits(number);
        
        boolean prime = isPrime(number);
        boolean neon = isNeon(number, digits);
        boolean spy = isSpy(number, digits);
        boolean automorphic = isAutomorphic(number);
        boolean buzz = isBuzz(number);
        
        System.out.println();
        // Printing the result 
        System.out.println("Is the number prime: " + prime);
        System.out.println("Is the number neon: " + neon);
        System.out.println("Is the number spy: " + spy);
        System.out.println("Is the number automorphic: " + automorphic);
        System.out.println("Is the number buzz: " + buzz);

        sc.close();

        
	}

}
