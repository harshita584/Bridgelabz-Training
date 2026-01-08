package bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    // EBooks get 20% discount
    @Override
    public double applyDiscount(double price, int quantity) {
        return price * quantity * 0.20;
    }
}
