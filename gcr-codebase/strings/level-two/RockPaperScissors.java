import java.util.Scanner;

public class RockPaperScissors {

    // method to get computer choice
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3); // 0,1,2
        switch (choice) {
            case 0: return "rock";
            case 1: return "paper";
            default: return "scissors";
        }
    }

    // method to determine winner
    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Draw";

        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        } else {
            return "Computer";
        }
    }

    // method to calculate averages and percentages
    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        String[][] stats = new String[2][3]; // Player and Computer rows

        double playerPercent = (playerWins * 100.0) / totalGames;
        double computerPercent = (computerWins * 100.0) / totalGames;

        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(playerWins);
        stats[0][2] = String.format("%.2f%%", playerPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.format("%.2f%%", computerPercent);

        return stats;
    }

    // method to display results
     public static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame\tUser Choice\tComputer Choice\tWinner");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t\t" +
                               games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nFinal Statistics");
        System.out.println("------------------------------");
        System.out.println("Player\tWins\tWin Percentage");

        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking input for number of games
        System.out.print("Enter number of games: ");
        int totalGames = scanner.nextInt();
        scanner.nextLine(); // consume newline

        String[][] gameResults = new String[totalGames][3]; // player, computer, winner
        int playerWins = 0, computerWins = 0;

        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);

            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;

            gameResults[i][0] = playerChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
        }

        // calculate stats
        String[][] stats = calculateStats(playerWins, computerWins, totalGames);

        // display results
        displayResults(gameResults, stats);

        scanner.close();
    }
}
