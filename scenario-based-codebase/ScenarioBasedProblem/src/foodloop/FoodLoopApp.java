package foodloop;

public class FoodLoopApp {
    public static void main(String[] args) {

        FoodItem paneer = new VegItem("Paneer Butter Masala", 250, 5);
        FoodItem biryani = new NonVegItem("Chicken Biryani", 350, 3);
        FoodItem naan = new VegItem("Butter Naan", 60, 10);
        FoodItem jeerarice =new VegItem("JeeraRice", 80, 10 );

        Order comboOrder = new Order(paneer, biryani, naan, jeerarice);

        comboOrder.placeOrder();
    }
}

