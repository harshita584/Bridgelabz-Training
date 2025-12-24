import java.util.Scanner;

public class LexicographicalCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // take first string
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();

        // take second string
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        boolean isDifferent = false;

        // compare character by character
        for (int i = 0; i < minLength; i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch1 < ch2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                isDifferent = true;
                break;
            }
            else if (ch1 > ch2) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
                isDifferent = true;
                break;
            }
        }

        // if all compared characters are same
        if (!isDifferent) {
            if (str1.length() < str2.length()) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
            }
            else if (str1.length() > str2.length()) {
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
            }
            else {
                System.out.println("Both strings are equal");
            }
        }
    }
}
