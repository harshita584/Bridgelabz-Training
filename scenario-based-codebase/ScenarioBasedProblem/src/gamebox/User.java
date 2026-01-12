package gamebox;

import java.util.*;

public class User {
    private String name;
    protected List<Game> ownedGames;

    public User(String name) {
        this.name = name;
        this.ownedGames = new ArrayList<>();
    }

    public void addGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.getTitle() + " added to library");
    }

    public void showLibrary() {
        System.out.println(name + "'s Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle());
        }
    }
}
