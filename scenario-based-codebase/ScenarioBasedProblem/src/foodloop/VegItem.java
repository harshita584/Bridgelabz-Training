package foodloop;

class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }


    double applyDiscount(double total) {
        if (total >= 500) {
            return total * 0.10; // 10% discount
        }
        return 0;
    }
}

