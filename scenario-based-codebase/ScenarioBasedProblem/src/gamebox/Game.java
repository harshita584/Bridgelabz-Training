package gamebox;

public class Game implements IDownloadable {
    protected String title;
    protected String genre;
    protected double price;
    protected double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public Game(String title, String genre) {
        this(title, genre, 0.0, 0.0);
    }

    public void applyOffer(double discount) {
        price = price - discount;
        if (price < 0) {
            price = 0;
        }
    }

    public void download() {
        System.out.println(title + " downloaded");
    }

    public void playDemo() {
        System.out.println("Playing demo of " + title);
    }

    public String getTitle() {
        return title;
    }
}
