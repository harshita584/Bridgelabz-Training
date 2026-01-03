package constructors.levelone;
//Create a Book class with attributes title, author, and price. Provide both default and parameterized constructors.
public class Book {
    String title;
    String author;
    double price;
	
    // parameterized constructor
    public Book(String title, String author, double price) {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	}
    
    // method to display book details
    public void displayDetails()
    {
    	System.out.println("The title of the book is : " + title);
		System.out.println("The author of the book is : " + author);
		System.out.println("The price of the book is : " + price);
    }
	public static void main(String[] args) {
		// using parameterized constructor
		Book book1 = new Book("Ikigai", "Francesc Miralles and Hector Garcia", 100.00);
		book1.displayDetails();
	}

}
