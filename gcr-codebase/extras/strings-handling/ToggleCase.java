import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take input string
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String result = "";   // to store final toggled string

        // loop through each character
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // if character is uppercase, convert to lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            // if character is lowercase, convert to uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            // if character is not an alphabet, keep it as it is
            else {
                result = result + ch;
            }
        }

        // print output
        System.out.println("After toggling case:");
        System.out.println(result);
    }
}
