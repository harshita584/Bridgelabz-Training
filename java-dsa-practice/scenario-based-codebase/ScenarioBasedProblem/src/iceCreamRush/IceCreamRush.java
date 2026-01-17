package iceCreamRush;

public class IceCreamRush {

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

            // if no swapping, array is already sorted
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

        // weekly sales count of ice cream flavors
        int[] arr = {120, 95, 150, 80, 110, 140, 90, 100};

        System.out.println("Unsorted Ice Cream Flavor Popularity\n");
        printarr(arr);

        bubbleSort(arr);

        System.out.println("\n\nSorted Ice Cream Flavor Popularity\n");
        printarr(arr);
    }
}
