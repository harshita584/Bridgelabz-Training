package swiftcart;

public abstract class Product {
    private String name;
    protected double price;   // accessible to child classes
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Polymorphic method
    public abstract double getDiscount();
}

