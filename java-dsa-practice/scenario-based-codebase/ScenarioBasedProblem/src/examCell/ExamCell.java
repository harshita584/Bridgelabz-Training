package examCell;

public class ExamCell {

    // Merge Sort method
    public static void mergeSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;

            // divide the array
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // method to merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right)
    {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data to temporary arrays
        for(int i = 0; i < n1; i++)
        {
            L[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++)
        {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // merge the temp arrays
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])   // maintains stability
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining elements
        while(i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
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

        // student scores collected from multiple centers
        int[] arr = {450, 520, 610, 480, 550, 590, 500, 470};

        System.out.println("Unsorted Student Scores\n");
        printarr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n\nSorted Student Rank List\n");
        printarr(arr);
    }
}
