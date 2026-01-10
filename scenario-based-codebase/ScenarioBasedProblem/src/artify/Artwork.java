package artify;

public abstract class Artwork implements IPurchasable {

    private String title;
    private String artist;
    private double price;
    private String licenseType;
    private boolean previewAvailable;

    // Protected for subclasses
    protected String licensingTerms;

    // Constructor with preview
    public Artwork(String title, String artist, double price, String licenseType, boolean previewAvailable) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.previewAvailable = previewAvailable;
    }

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this(title, artist, price, licenseType, false);
    }

    // Getters (Encapsulation)
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public boolean isPreviewAvailable() {
        return previewAvailable;
    }

    public abstract void license();
}
