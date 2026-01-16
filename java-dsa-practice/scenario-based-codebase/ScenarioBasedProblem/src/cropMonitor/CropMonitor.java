package cropMonitor;

public class CropMonitor {

    // Quick Sort method
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pi = partition(arr, low, high);

            // recursive sorting
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // method to partition the array
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];   // last element as pivot (timestamp)
        int i = low - 1;

        for(int j = low; j < high; j++)
        {
            if(arr[j] < pivot)
            {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
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

        // sensor timestamps collected by drones
        int[] arr = {1050, 980, 1120, 1010, 1200, 990, 1080};

        System.out.println("Unsorted Sensor Timestamps\n");
        printarr(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Sensor Timestamps\n");
        printarr(arr);
    }
}
