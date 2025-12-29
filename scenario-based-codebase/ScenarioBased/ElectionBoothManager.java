import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.println("\nEnter age (or -1 to stop voting): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.println("Vote for candidate:");
                System.out.println("1. Candidate 1");
                System.out.println("2. Candidate 2");
                System.out.println("3. Candidate 3");

                int vote = sc.nextInt();

                if (vote == 1) {
                    candidate1Votes++;
                } else if (vote == 2) {
                    candidate2Votes++;
                } else if (vote == 3) {
                    candidate3Votes++;
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }

        // Display results
        System.out.println("\n--- Voting Results ---");
        System.out.println("Candidate 1 Votes: " + candidate1Votes);
        System.out.println("Candidate 2 Votes: " + candidate2Votes);
        System.out.println("Candidate 3 Votes: " + candidate3Votes);

        sc.close();
    }
}
