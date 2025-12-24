public class RemoveDuplicatesString {

    // method to remove duplicate characters
    public static String removeDuplicates(String str) {

        // StringBuilder is used to store final result
        StringBuilder result = new StringBuilder();

        // loop through each character of the string
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);   // get current character

            // check if character is already present
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);    // add character if not present
            }
        }

        return result.toString();     // convert StringBuilder to String
    }

    public static void main(String[] args) {

        String input = "programming";

        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + removeDuplicates(input));
    }
}
