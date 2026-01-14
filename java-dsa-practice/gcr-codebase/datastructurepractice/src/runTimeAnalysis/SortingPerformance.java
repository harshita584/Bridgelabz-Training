package runTimeAnalysis;
import java.util.Random;
import java.util.Arrays;

public class SortingPerformance {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    // Quick Sort 
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
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

    public static void main(String[] args) {

        int N = 10000; 
        Random random = new Random();

        int[] original = new int[N];
        for (int i = 0; i < N; i++) {
            original[i] = random.nextInt(N);
        }

        int[] bubbleArr = Arrays.copyOf(original, N);
        int[] mergeArr = Arrays.copyOf(original, N);
        int[] quickArr = Arrays.copyOf(original, N);

        long startBubble = System.nanoTime();
        bubbleSort(bubbleArr);
        long endBubble = System.nanoTime();

        long startMerge = System.nanoTime();
        mergeSort(mergeArr, 0, mergeArr.length - 1);
        long endMerge = System.nanoTime();

        long startQuick = System.nanoTime();
        quickSort(quickArr, 0, quickArr.length - 1);
        long endQuick = System.nanoTime();

        System.out.println("Dataset Size: " + N);
        System.out.println("Bubble Sort Time: " +
                (endBubble - startBubble) / 1000000.0 + " ms");

        System.out.println("Merge Sort Time: " +
                (endMerge - startMerge) / 1000000.0 + " ms");

        System.out.println("Quick Sort Time: " +
                (endQuick - startQuick) / 1000000.0 + " ms");
    }
}