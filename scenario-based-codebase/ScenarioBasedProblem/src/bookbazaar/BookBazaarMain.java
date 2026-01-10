package bookbazaar;

public class BookBazaarMain {

    public static void main(String[] args) {

        Book ebook = new EBook(
                "Let Us C",
                "Yashwant Kanetkar",
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

        order.addBook(ebook, 2);
        order.addBook(printedBook, 1);

        double totalAmount = order.calculateTotal();

        // Display results
        System.out.println("\nBookBazaar Order Summary");
        System.out.println("Customer Name : Harshita Patel");
        System.out.println("Order Status  : " + order.getOrderStatus());
        System.out.println("Total Amount  : Rs." + totalAmount);

        // Remaining stock
        System.out.println("\nRemaining Stock:");
        System.out.println("EBook Stock        : " + ebook.getStock());
        System.out.println("Printed Book Stock : " + printedBook.getStock());
    }
}

