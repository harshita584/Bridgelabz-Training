package foodFest;

public class FoodFest {

    // Merge Sort method
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort left half
            mergeSort(arr, left, mid);
            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // Merge the temp arrays (stable merge)
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {

        // Daily footfall data from multiple zones (already sorted)
        int[] footfall = {120, 150, 200, 130, 180, 220};

        System.out.println("Unsorted Footfall Data:");
        printArray(footfall);

        mergeSort(footfall, 0, footfall.length - 1);

        System.out.println("\n\nSorted Footfall Data:");
        printArray(footfall);
    }
}
