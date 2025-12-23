import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {

    // method to initialize deck
    public static String[] initializeDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // method to shuffle deck
    public static void shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    // method to distribute cards
    public static String[][] distributeCards(String[] deck, int n, int players) {
        if (n % players != 0) {
            System.out.println("Cards cannot be evenly distributed!");
            return null;
        }
        int cardsPerPlayer = n / players;
        String[][] playerCards = new String[players][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    // method to print players and their cards
    public static void printPlayers(String[][] playerCards) {
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i+1) + ":");
            for (String card : playerCards[i]) {
                System.out.println("  " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // initialize and shuffle deck
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        // taking inputs
        System.out.print("Enter number of cards to distribute: ");
        int n = scanner.nextInt();
        System.out.print("Enter number of players: ");
        int players = scanner.nextInt();

        // distribute and print
        String[][] playerCards = distributeCards(deck, n, players);
        if (playerCards != null) {
            printPlayers(playerCards);
        }

        scanner.close();
    }
}
