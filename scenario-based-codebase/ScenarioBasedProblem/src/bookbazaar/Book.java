package bookbazaar;

public abstract class Book implements IDiscountable {

    private String title;
    private String author;
    protected double price;   // protected for subclasses
    private int stock;

    // Constructor without offer
    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    // Encapsulation: stock can only be modified via methods
    public boolean reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
            return true;
        }
        return false;
    }

    public int getStock() {
        return stock;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    // Abstract discount method → Polymorphism
    public abstract double applyDiscount(double price, int quantity);
}
