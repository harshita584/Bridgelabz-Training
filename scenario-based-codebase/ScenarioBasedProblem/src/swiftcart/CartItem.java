package swiftcart;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public double getDiscount() {
        return product.getDiscount() * quantity;
    }

    public Product getProduct() {
        return product;
    }
}

