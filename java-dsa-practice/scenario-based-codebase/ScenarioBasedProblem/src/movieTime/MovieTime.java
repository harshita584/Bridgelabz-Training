package movieTime;

public class MovieTime {

    // Insertion Sort to sort showtimes
    public static void insertionSort(String[] showTimes) {
        for (int i = 1; i < showTimes.length; i++) {
            String key = showTimes[i];
            int j = i - 1;

            // Move later showtimes one step ahead
            while (j >= 0 && showTimes[j].compareTo(key) > 0) {
                showTimes[j + 1] = showTimes[j];
                j--;
            }
            showTimes[j + 1] = key;
        }
    }

    // Display showtimes
    public static void printShowTimes(String[] showTimes) {
        for (String time : showTimes) {
            System.out.print(time + "  ");
        }
    }

    public static void main(String[] args) {

        // Almost sorted showtimes (real-time insertion scenario)
        String[] showTimes = {"10:00", "12:30", "14:00", "16:00", "18:30", "15:00"};

        System.out.println("Unsorted Showtimes:");
        printShowTimes(showTimes);

        insertionSort(showTimes);

        System.out.println("\n\nSorted Showtimes:");
        printShowTimes(showTimes);
    }
}
