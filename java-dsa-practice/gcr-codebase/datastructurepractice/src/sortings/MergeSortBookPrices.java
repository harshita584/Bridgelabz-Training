package sortings;

public class MergeSortBookPrices {

    // method to merge two sorted halves
    static void merge(int arr[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy data to temporary arrays
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // merge the temp arrays
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

        // copy remaining elements of L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // copy remaining elements of R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // merge sort method
    static void mergeSort(int arr[], int left, int right) {

        if (left < right) {
            int mid = (left + right) / 2;

            // sort first half
            mergeSort(arr, left, mid);

            // sort second half
            mergeSort(arr, mid + 1, right);

            // merge both halves
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {

        int[] prices = {450, 299, 1200, 650, 199, 799};

        System.out.println("Book prices before sorting:");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }

        mergeSort(prices, 0, prices.length - 1);

        System.out.println("\n\nBook prices after sorting (Ascending Order):");
        for (int i = 0; i < prices.length; i++) {
            System.out.print(prices[i] + " ");
        }
    }
}
