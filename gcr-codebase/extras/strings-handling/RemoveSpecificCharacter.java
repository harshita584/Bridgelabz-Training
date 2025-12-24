import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take string input
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        // take character to remove
        System.out.println("Enter the character to remove:");
        char removeChar = sc.next().charAt(0);

        String result = "";   // to store modified string

        // loop through each character
        for (int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            // add character only if it is not equal to removeChar
            if (ch != removeChar) {
                result = result + ch;
            }
        }

        // print output
        System.out.println("Modified String: \"" + result + "\"");
    }
}
