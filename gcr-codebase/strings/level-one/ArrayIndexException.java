import java.util.Scanner;
public class ArrayIndexException {
	
	// Method to generate the Exception
	public static void generateException(int[] arr)
	{
		System.out.println(arr[arr.length+1]);
	}
	
	// Method to demonstrate ArrayIndexOutOfBoundsException
       public static void handleException(int[] arr)
       {
	   try {
		   System.out.println(arr[arr.length+1]);
           }
           catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("ArrayIndexOutOfBoundsException handled successfully.");
           }
           catch (RuntimeException e) {
           System.out.println("Generic RuntimeException handled.");
       }
   }
	
	public static void main(String[] args) {
		int []arr = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Enter the element " + (i+1) + ": ");
			arr[i] = sc.nextInt();
		}

		 // Calling method that generates exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(arr);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main method.");
        }

        // Calling method that handles exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(arr);

        sc.close();
		
	}
}
