package cinemaHouse;

public class CinemaHouse {

    // Bubble Sort method
    public static void bubbleSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            boolean swapped = false;

            for(int j = 0; j < arr.length - 1 - i; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // if no swapping happens, array is already sorted
            if(swapped == false)
            {
                break;
            }
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

        // movie show timings (in 24-hour format)
        int[] arr = {1800, 1500, 2100, 1200, 2000, 1700, 1400};

        System.out.println("Unsorted Movie Show Timings\n");
        printarr(arr);

        bubbleSort(arr);

        System.out.println("\n\nSorted Movie Show Timings\n");
        printarr(arr);
    }
}
