package swiftcart;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double getDiscount() {
        return price * 0.10; // 10% discount
    }
}
