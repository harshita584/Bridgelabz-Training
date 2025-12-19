import java.util.Scanner;

public class MaxFactors {

	public static void main(String[] args) {
		// Taking input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		int maxFactor = 10;
		int factors[] = new int[maxFactor];
		int index=0;
           for(int i=1; i<=number; i++)
        {
                if(number%i == 0)
        	{
        		//If array is full increase its size
        		if(index == maxFactor)
            	{
            		maxFactor*=2;
            		int temp[] = new int[maxFactor];
            		// copying old elements to new array
            		for(int j=0; j<index; j++)
            		{
            			temp[j] = factors[j];
            		}
            		// factors will now point to the new array
            		factors = temp;
            	}
        		
        		factors[index++]=i;
        	}
        	
        }
        
        //Printing the factors
        for(int i=0; i<index; i++)
           {
        	System.out.println(factors[i]);
           }
	}

}
