package bookbazaar;

import java.util.HashMap;
import java.util.Map;

public class Order {

    private String userName;
    private Map<Book, Integer> items = new HashMap<>();
    private String orderStatus = "CREATED"; // restricted access

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        if (book.reduceStock(quantity)) {
            items.put(book, quantity);
        } else {
            System.out.println("Insufficient stock for: " + book.getTitle());
        }
    }

    // Operator usage: price × quantity − discount
    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int quantity = entry.getValue();

            double cost = book.getPrice() * quantity;
            double discount = book.applyDiscount(book.getPrice(), quantity);

            total += (cost - discount);
        }
        return total;
    }

    // Access modifier restricts direct updates
    protected void updateOrderStatus(String status) {
        this.orderStatus = status;
    }

    public String getOrderStatus() {
        return orderStatus;
    }
}

