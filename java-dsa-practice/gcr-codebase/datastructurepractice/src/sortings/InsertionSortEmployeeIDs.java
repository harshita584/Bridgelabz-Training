package sortings;

public class InsertionSortEmployeeIDs {

    public static void main(String[] args) {

        int[] empIds = {105, 102, 110, 101, 108};
        int n = empIds.length;

        // Insertion Sort logic
        for (int i = 1; i < n; i++) {

            int key = empIds[i];   // element to be inserted
            int j = i - 1;

            // shift elements greater than key to one position ahead
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // place key at correct position
            empIds[j + 1] = key;
        }

        // displaying sorted employee IDs
        System.out.println("Employee IDs in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(empIds[i] + " ");
        }
    }
}

