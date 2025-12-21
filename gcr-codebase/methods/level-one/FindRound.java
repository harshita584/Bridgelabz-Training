import java.util.Scanner;

public class FindRound {

    // method for finding the rounds
    public static void findingRounds(double fisrtSide, double secondSide, double thirdSide) {
        int rounds = (int) (Math.ceil(5000.0 / (fisrtSide + secondSide + thirdSide)));
        System.out.println("For complete 5k.m Athlete have to run " + rounds + "'s");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fisrtSide, secondSide, thirdSide;

        // Taking Sides of the Triangle from the user
        System.out.println("Enter First Side :");
        fisrtSide = scanner.nextDouble();
        System.out.println("Enter Second Side :");
        secondSide = scanner.nextDouble();
        System.out.println("Enter Third Side :");
        thirdSide = scanner.nextDouble();

        // Calling the method
        FindRound.findingRounds(fisrtSide, secondSide, thirdSide);

        scanner.close();

    }
}
