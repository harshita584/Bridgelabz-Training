package flashdealz;

public class FlashDealz {

	public static void quickSort(int []arr, int low, int high)
	{
		if(low<high)
		{
			int pi = partition(arr, low, high);
			
			// partition to the left side
			quickSort(arr, low, pi-1);
			// partition to the right side
			quickSort(arr, pi+1, high);
		}
	}
	
	// partition method
	public static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;
		 
		for(int j=low; j<high; j++)
		{
			if(arr[j] < pivot)
			{
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;
		
		return i+1;
	}
	
	// display an array
	public static void display(int[] arr) {
		for(int a : arr)
		{
			System.out.print(a + " ");
		}
	}
	
	public static void main(String[] args) {
       int[] arr = {1500, 1600, 1700, 1550, 1634, 1342, 1578, 1690, 1700, 1525, 1405, 1509};
		
		System.out.println("Printing the array: \n");
		display(arr);
		
		quickSort(arr, 0, arr.length-1);
		
		System.out.println("\n\nPrinting the sorted array: \n");
		display(arr);
	}

}
