package gamebox;

public class ArcadeGame extends Game {

    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public void playDemo() {
        System.out.println("Fast-paced arcade demo of " + title);
    }
}
