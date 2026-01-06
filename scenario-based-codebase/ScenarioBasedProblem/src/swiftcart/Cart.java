package swiftcart;

import java.util.ArrayList;
import java.util.List;

public class Cart implements ICheckout {

    private List<CartItem> items = new ArrayList<>();
    private double totalPrice;

    public void addProduct(Product product, int quantity) {
        items.add(new CartItem(product, quantity));
        totalPrice += product.getPrice() * quantity;
    }

    @Override
    public void applyDiscount(double couponAmount) {
        double discount = 0;

        for (CartItem item : items) {
            discount += item.getDiscount(); // polymorphism + quantity
        }

        totalPrice = totalPrice - discount - couponAmount;
    }

    @Override
    public void generateBill() {
        System.out.println("---- SwiftCart Bill ----");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() +
                    " - Rs" + item.getTotalPrice());
        }
        System.out.println("Total Payable: Rs" + totalPrice);
    }
}
