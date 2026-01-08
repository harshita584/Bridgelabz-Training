package bookbazaar;

public class BookBazaarMain {

    public static void main(String[] args) {

        // Create books (Inheritance + Constructors)
        Book ebook = new EBook(
                "Java Mastery",
                "James Gosling",
                500.0,
                10
        );

        Book printedBook = new PrintedBook(
                "Clean Code",
                "Robert C. Martin",
                800.0,
                5
        );

        // Create order
        Order order = new Order("Harshita Patel");

        // Add books to order (Encapsulation: stock updated via method)
        order.addBook(ebook, 2);
        order.addBook(printedBook, 1);

        // Calculate total (Polymorphism + Operators)
        double totalAmount = order.calculateTotal();

        // Display results
        System.out.println("===== BookBazaar Order Summary =====");
        System.out.println("Customer Name : Harshita Patel");
        System.out.println("Order Status  : " + order.getOrderStatus());
        System.out.println("Total Amount  : ₹" + totalAmount);

        // Remaining stock
        System.out.println("\nRemaining Stock:");
        System.out.println("EBook Stock        : " + ebook.getStock());
        System.out.println("Printed Book Stock : " + printedBook.getStock());
    }
}

