import java.util.Scanner;
public class Factors {

	// Method to find factors of a number and return them as an array.
	public static int[] factors(int number)
	{
		// Count of factors
		int count = 0;
	        for (int i = 1; i <= number; i++) {
	        if (number % i == 0) {
	            count++;
	        }
	    }
	    
		int[] factor = new int[count];
		int index=0;
		for(int i=1; i<=number; i++)
		{
			if(number%i == 0)
			{
				factor[index++] = i;
			}
		}
		return factor;
	}
	
	// Method to find the greatest factor of a Number using the factors array
	public static int greatestFactor(int[] factorsOfNumber)
	{
		return factorsOfNumber[factorsOfNumber.length-2];
	}
	
	// Method to find the sum of the factors using factors array and return the sum
	public static int sumFactor(int[] factorsOfNumber)
	{
		int sum = 0;
		for(int i=0; i<factorsOfNumber.length; i++)
		{
			sum += factorsOfNumber[i];
		}
		return sum;
	}
	
	// Method to find the product of the factors using factors array and return the product
	public static int productFactor(int[] factorsOfNumber)
	{
		int product = 1;
		for(int i=0; i<factorsOfNumber.length; i++)
		{
			product *= factorsOfNumber[i];
		}
		return product;
	}
	
	// Method to find the product of the cube of the factors using the factors array. 
	public static int cubeProductFactor(int[] factorsOfNumber)
	{
		int cubeProduct = 1;
		for(int i=0; i<factorsOfNumber.length; i++)
		{
			cubeProduct *= Math.pow(factorsOfNumber[i],3);
		}
		return cubeProduct;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		int[] factorsOfNumber = factors(number);
		
		System.out.println("The factors of number " + number + " is: ");
		for(int i=0; i<factorsOfNumber.length; i++)
		{
			System.out.print(factorsOfNumber[i] + " ");
		}
		
		int greatestFactorOfNumber = greatestFactor(factorsOfNumber);
		int sumOfFactors = sumFactor(factorsOfNumber);
		int productOfFactors = productFactor(factorsOfNumber);
		int CubeOfProductOfFactors = cubeProductFactor(factorsOfNumber);
		
		// Displaying the result
                System.out.println();
		System.out.println("The Greatest Factor of the number is        : " + greatestFactorOfNumber);
		System.out.println("The Sum of the Factors of the number is     : " + sumOfFactors);
		System.out.println("The Product of the Factors of the number is : " + productOfFactors);
		System.out.println("The Cube of the product of the Factors is   : " + CubeOfProductOfFactors);
		
	}

}
