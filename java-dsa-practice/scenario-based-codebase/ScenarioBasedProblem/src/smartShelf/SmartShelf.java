package smartShelf;

public class SmartShelf {
	
	public static void insertionSort(String[] arr)
	{
		  //insertion sort
		   for(int i=1; i<arr.length; i++)
		   {
			   int j = i-1;
			   String key = arr[i];
			   while(j>=0 && arr[j].compareTo(key) > 0)
			   {
				   arr[j+1] = arr[j];
				   j--;
			   }
			   arr[j+1] = key;
		   }
	}
	
	// method to display the array
	public static void printarr(String[] arr)
	{
		for(int i=0; i<arr.length; i++)
	    {
		   System.out.print(arr[i] + " ");
		}
	}
	
    public static void main(String[] args) {
	   String[] arr = {"'Java'", "'C'", "'Web Development'", "'Python'", "'Ruby'", "'Blockchain'", "'Gen AI'"};
	   
	   // display the unsorted array
	   System.out.println("The Unsorted array is\n");
	   printarr(arr);
	   
	   insertionSort(arr);
	   
	   // display the sorted array
	   System.out.println("\n\nThe sorted array is\n");
	   printarr(arr);
    }
}
