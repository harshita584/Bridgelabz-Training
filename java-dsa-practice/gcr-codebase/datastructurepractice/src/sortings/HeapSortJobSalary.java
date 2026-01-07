package sortings;

public class HeapSortJobSalary {

    // method to heapify a subtree
    static void heapify(int arr[], int n, int i) {

        int largest = i;        // assume root is largest
        int left = 2 * i + 1;   // left child
        int right = 2 * i + 2;  // right child

        // if left child is larger
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // if right child is larger
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // if largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // heap sort method
    static void heapSort(int arr[]) {

        int n = arr.length;

        // build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {

            // move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call heapify on reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void main(String[] args) {

        int[] salary = {45000, 60000, 35000, 80000, 50000};

        System.out.println("Salary demands before sorting:");
        for (int i = 0; i < salary.length; i++) {
            System.out.print(salary[i] + " ");
        }

        heapSort(salary);

        System.out.println("\n\nSalary demands after sorting (Ascending Order):");
        for (int i = 0; i < salary.length; i++) {
            System.out.print(salary[i] + " ");
        }
    }
}

