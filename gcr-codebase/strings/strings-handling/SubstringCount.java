import java.util.Scanner;

public class SubstringCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take main string as input
        System.out.println("Enter the main string:");
        String text = sc.nextLine();

        // take substring as input
        System.out.println("Enter the substring to search:");
        String sub = sc.nextLine();

        int count = 0;   // to store number of occurrences
        int index = 0;   // starting index for search

        // loop until substring is not found
        while ((index = text.indexOf(sub, index)) != -1) {
            count++;                 // increase count
            index = index + sub.length(); // move index forward
        }

        // print result
        System.out.println("Substring occurs " + count + " times");
    }
}
