import java.util.Scanner;

public class FriendsComparison {

    // Method to find the youngest friend
    static int findYoungest(int[] ages) {

        int minIndex = 0;

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find the tallest friend
    static int findTallest(double[] heights) {

        int maxIndex = 0;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // Method to print name without using String
    static void printName(int index) {
        if (index == 0) {
            System.out.println("Amar");
        } else if (index == 1) {
            System.out.println("Akbar");
        } else if (index == 2) {
            System.out.println("Anthony");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input for Amar (index 0)
        System.out.print("Enter age of Amar: ");
        ages[0] = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        heights[0] = sc.nextDouble();

        // Input for Akbar (index 1)
        System.out.print("\nEnter age of Akbar: ");
        ages[1] = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        heights[1] = sc.nextDouble();

        // Input for Anthony (index 2)
        System.out.print("\nEnter age of Anthony: ");
        ages[2] = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        heights[2] = sc.nextDouble();

        int youngestIndex = findYoungest(ages);
        int tallestIndex = findTallest(heights);

        System.out.print("\nYoungest friend is: ");
        printName(youngestIndex);

        System.out.print("Tallest friend is: ");
        printName(tallestIndex);
    }
}
