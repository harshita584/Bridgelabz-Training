package artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price, String licenseType, boolean previewAvailable) {
        super(title, artist, price, licenseType, previewAvailable);
        this.licensingTerms = "Single print allowed. No commercial resale.";
    }

    public PrintArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licensingTerms = "Single print allowed. No commercial resale.";
    }

    @Override
    public void purchase(User user) {
        if (user.deductBalance(getPrice())) {
            System.out.println("Print artwork purchased successfully.");
        } else {
            System.out.println("Insufficient wallet balance.");
        }
    }

    @Override
    public void license() {
        System.out.println("Print Art License: " + licensingTerms);
    }
}
