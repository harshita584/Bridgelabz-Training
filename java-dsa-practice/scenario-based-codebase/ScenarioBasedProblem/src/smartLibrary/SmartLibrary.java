package smartLibrary;

public class SmartLibrary {

    // Insertion Sort method
    public static void insertionSort(String[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            String key = arr[i];
            int j = i - 1;

            // insert the new book into the sorted list
            while(j >= 0 && arr[j].compareTo(key) > 0)
            {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // method to display the array
    public static void printarr(String[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // borrowed book titles
        String[] arr = {"Java", "C Programming", "Python", "Data Structures", "Algorithms"};

        System.out.println("Unsorted Borrowed Books\n");
        printarr(arr);

        insertionSort(arr);

        System.out.println("\n\nSorted Borrowed Books\n");
        printarr(arr);
    }
}
