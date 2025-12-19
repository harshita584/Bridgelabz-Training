import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store age and height
        int[] age = new int[3];
        double[] height = new double[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            height[i] = sc.nextDouble();
        }

        // Assume first friend is youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }

            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend:");
        System.out.println(names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");

        System.out.println("Tallest Friend:");
        System.out.println(names[tallestIndex] + " (Height: " + height[tallestIndex] + " cm)");
    }
}
