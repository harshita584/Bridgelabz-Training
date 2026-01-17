package artExpo;

public class ArtExpo {

    // Insertion Sort method
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            // insert the new artist into the sorted list
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // method to display the array
    public static void printarr(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // artist registration times (in minutes)
        int[] arr = {120, 90, 150, 110, 130, 100};

        System.out.println("Unsorted Artist Registration Times\n");
        printarr(arr);

        insertionSort(arr);

        System.out.println("\n\nSorted Artist Registration Times\n");
        printarr(arr);
    }
}
