package swiftcart;

public class SwiftCartApp {
    public static void main(String[] args) {

        Product milk = new PerishableProduct("Milk", 50);
        Product rice = new NonPerishableProduct("Rice", 100);

        Cart cart = new Cart();
        cart.addProduct(milk, 2);
        cart.addProduct(rice, 1);

        cart.applyDiscount(20); // coupon
        cart.generateBill();
    }
}

