package gamebox;

public class GameBoxApp {
    public static void main(String[] args) {

        Game arcade = new ArcadeGame("Need For Speed", 299, 4.5);
        Game strategy = new StrategyGame("God Of War", 499, 4.7);

        arcade.applyOffer(100);

        arcade.playDemo();
        strategy.playDemo();

        arcade.download();
        strategy.download();

        User user = new User("Ali");
        user.addGame(arcade);
        user.addGame(strategy);

        user.showLibrary();
    }
}
