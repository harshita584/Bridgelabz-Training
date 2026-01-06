package swiftcart;

public interface ICheckout {
    void generateBill();
    void applyDiscount(double couponAmount);
}

