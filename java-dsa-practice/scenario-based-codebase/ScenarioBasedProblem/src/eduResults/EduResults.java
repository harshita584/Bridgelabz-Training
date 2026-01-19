package eduResults;

public class EduResults {

    // Merge Sort method
    public static void mergeSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;

            // divide the array into sublists
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // merge the sorted sublists
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

        // copy data into temporary arrays
        for(int i = 0; i < n1; i++)
        {
            L[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++)
        {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // merge while maintaining stability
        while(i < n1 && j < n2)
        {
            if(L[i] <= R[j])   // stable sorting for duplicate scores
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

        // student marks received from different districts (already sorted locally)
        int[] arr = {450, 480, 500, 500, 520, 550, 580, 600};

        System.out.println("Unsorted Combined District Marks\n");
        printarr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\n\nFinal State-wise Rank List\n");
        printarr(arr);
    }
}
