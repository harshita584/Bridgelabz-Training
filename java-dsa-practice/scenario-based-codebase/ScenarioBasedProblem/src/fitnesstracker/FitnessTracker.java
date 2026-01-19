package fitnesstracker;

public class FitnessTracker {
    
	public static void bubbleSort(int[] arr)
	{
		for(int i=0; i<arr.length-1; i++)
		{
			boolean swapped = false;
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					swapped = true;
				}
			}
			// if no swapping, array is already sorted
            if(swapped == false)
            {
                break;
            }
		}
	}
	
	public static void main(String[] args) {
		 
		int[] arr = {1500, 1600, 1700, 1550, 1634, 1342, 1578, 1690, 1700, 1525, 1405, 1509};
		
		System.out.println("Printing the array: \n");
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
		
		bubbleSort(arr);
		
		System.out.println("\n\nPrinting the sorted array: \n");
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}
}
