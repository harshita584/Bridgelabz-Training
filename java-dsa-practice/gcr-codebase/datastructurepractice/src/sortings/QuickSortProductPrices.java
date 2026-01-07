package sortings;

public class QuickSortProductPrices {

    // method to partition the array
    static int partition(int arr[], int low, int high) {

        int pivot = arr[high];   // taking last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {

            // if current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // quick sort method
    static void quickSort(int arr[], int low, int high) {

        if (low < high) {

            int pi = partition(arr, low, high);

            // sort left part
            quickSort(arr, low, pi - 1);

            // sort right part
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        int[] prices = {999, 499, 1299, 299, 799, 199};

        System.out.println("Product prices before sorting:");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }

        quickSort(prices, 0, prices.length - 1);

        System.out.println("\n\nProduct prices after sorting (Ascending Order):");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}

