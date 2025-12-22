import java.util.Scanner;

public class VotingEligibility {

    // Generating random 2-digit ages for n students
    public static int[] generateRandomAges(int n) {

        int[] ages = new int[10];

        for (int i = 0; i < n; i++) {
            // Random 2-digit age between 10 and 99
            ages[i] = (int) (Math.random() * 90) + 10;
        }

        return ages;
    }

    // Checking voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]); // Age as String

            // Validate age
            if (ages[i] < 0) {
                result[i][1] = "false"; // Invalid age
            } else if (ages[i] >= 18) {
                result[i][1] = "true";  // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }

        return result;
    }

    // Displaying 2D array in tabular format
    public static void displayTable(String[][] table) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate random ages
        int[] ages = generateRandomAges(n);

        // Check voting eligibility
        String[][] votingResult = checkVotingEligibility(ages);

        // Displaying result
        displayTable(votingResult);
    }
}
