package artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price, String licenseType, boolean previewAvailable) {
        super(title, artist, price, licenseType, previewAvailable);
        this.licensingTerms = "Digital use only. No redistribution allowed.";
    }

    public DigitalArt(String title, String artist, double price, String licenseType) {
        super(title, artist, price, licenseType);
        this.licensingTerms = "Digital use only. No redistribution allowed.";
    }

    @Override
    public void purchase(User user) {
        if (user.deductBalance(getPrice())) {
            System.out.println("Digital artwork purchased successfully.");
        } else {
            System.out.println("Insufficient wallet balance.");
        }
    }

    @Override
    public void license() {
        System.out.println("Digital Art License: " + licensingTerms);
    }
}
