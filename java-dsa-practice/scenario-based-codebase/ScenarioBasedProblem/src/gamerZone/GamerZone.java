package gamerZone;

public class GamerZone {

    // Quick Sort method
    public static void quickSort(int[] scores, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(scores, low, high);

            // Sort elements before and after pivot
            quickSort(scores, low, pivotIndex - 1);
            quickSort(scores, pivotIndex + 1, high);
        }
    }

    // Partition method
    public static int partition(int[] scores, int low, int high) {
        int pivot = scores[high]; // last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (scores[j] > pivot) {   // Descending order (high score first)
                i++;
                int temp = scores[i];
                scores[i] = scores[j];
                scores[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = scores[i + 1];
        scores[i + 1] = scores[high];
        scores[high] = temp;

        return i + 1;
    }

    // Display scores
    public static void printScores(int[] scores) {
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }

    public static void main(String[] args) {

        // Player scores after a match (unsorted & dynamic)
        int[] scores = {450, 1200, 780, 300, 950, 600};

        System.out.println("Unsorted Scores:");
        printScores(scores);

        quickSort(scores, 0, scores.length - 1);

        System.out.println("\n\nLeaderboard (Sorted Scores):");
        printScores(scores);
    }
}
