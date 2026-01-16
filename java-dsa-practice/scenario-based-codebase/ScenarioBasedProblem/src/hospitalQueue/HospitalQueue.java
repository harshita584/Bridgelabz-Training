package hospitalQueue;

public class HospitalQueue {
	
	public static void booleanSort(int[] arr)
	{
		//Bubble Sort
		for(int i=0; i<arr.length-1; i++)
		{
			boolean swapped = false;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false)
			{
				break;
			}
		}
	}
	
	// method to display the array
	public static void printarr(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
	    {
		   System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
       
		// list of patients based on their criticality level
		int[] arr = {1,5,4,3,10,2,3,8,7,8,9,2,6};
		
		System.out.println("UnSorted Order of Patients\n");
		printarr(arr);
		
		booleanSort(arr);
		
		System.out.println("\n\nSorted Order of Patients\n");
		printarr(arr);
	}

}
