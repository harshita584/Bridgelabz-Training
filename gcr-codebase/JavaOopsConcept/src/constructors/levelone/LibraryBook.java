package constructors.levelone;

public class LibraryBook {

    String title;
    String author;
    double price;
    boolean available;

    // Parameterized constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;   // book is available by default
    }

    // Method to borrow a book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    public static void main(String[] args) {

        LibraryBook b1 = new LibraryBook("Java Basics", "Herbert Schildt", 450.0);

        System.out.println("Availability before borrowing: " + b1.available);
        b1.borrowBook();
        System.out.println("Availability after borrowing: " + b1.available);

        // Trying to borrow again
        b1.borrowBook();
    }
}
