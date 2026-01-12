package gamebox;

public class StrategyGame extends Game {

    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public void playDemo() {
        System.out.println("Thinking-based strategy demo of " + title);
    }
}
