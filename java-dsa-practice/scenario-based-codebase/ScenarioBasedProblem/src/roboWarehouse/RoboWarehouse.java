package roboWarehouse;

public class RoboWarehouse {

    // Insertion Sort method
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            // insert the element into the sorted part
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

        // package weights loaded by the robot
        int[] arr = {45, 20, 60, 10, 35, 50, 25};

        System.out.println("Unsorted Package Weights\n");
        printarr(arr);

        insertionSort(arr);

        System.out.println("\n\nSorted Package Weights\n");
        printarr(arr);
    }
}
