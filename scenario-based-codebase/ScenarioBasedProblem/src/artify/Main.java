package artify;

public class Main {
    public static void main(String[] args) {

        User user = new User("Harshita", 5000);

        Artwork digitalArt = new DigitalArt(
                "Sunset NFT", "Aarav", 2000, "Personal", true
        );

        Artwork printArt = new PrintArt(
                "Nature Canvas", "Meera", 1500, "Print"
        );

        digitalArt.purchase(user);
        digitalArt.license();

        printArt.purchase(user);
        printArt.license();

        System.out.println("Remaining Wallet Balance: " + user.getWalletBalance());
    }
}
