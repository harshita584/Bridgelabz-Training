package foodloop;

class NonVegItem extends FoodItem {

    public NonVegItem(String name, double price, int stock) {
        super(name, "Non-Veg", price, stock);
    }

    @Override
    double applyDiscount(double total) {
        if (total >= 500) {
            return total * 0.10; // 10% discount
        }
        return 0;
    } 
}

