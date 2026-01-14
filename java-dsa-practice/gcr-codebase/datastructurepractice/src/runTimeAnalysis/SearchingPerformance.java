package runTimeAnalysis;
import java.util.*;

public class SearchingPerformance{

    // Linear Search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N = 1000000;    
        int target = N - 1;
        int[] data = new int[N];
        for (int i = 0; i < N; i++) {
            data[i] = i;
        }

        long startLinear = System.nanoTime();
        linearSearch(data, target);
        long endLinear = System.nanoTime();
        Arrays.sort(data);
        long startBinary = System.nanoTime();
        binarySearch(data, target);
        long endBinary = System.nanoTime();

        System.out.println("Linear Search Time: " +
                (endLinear - startLinear) / 1000000.0 + " ms");
        System.out.println("Binary Search Time: " +
                (endBinary - startBinary) / 1000000.0 + " ms");
    }
}