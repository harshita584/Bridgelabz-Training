import java.util.Scanner;

public class StudentCanVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        // Taking user input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element: " + (i + 1));
            arr[i] = sc.nextInt();
        }

        // Printing whether a person can vote or not
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.println("Invalid age.");
            } else if (arr[i] >= 18) {
                System.out.println("The student with the age " + arr[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + arr[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
