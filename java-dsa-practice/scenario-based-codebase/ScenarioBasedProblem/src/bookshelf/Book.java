package bookshelf;

public class Book {
    int bookId;
    String bookTitle;
    String bookAuthor;
    double bookPrice;
    
	public Book(int bookId, String bookTitle, String bookAuthor, double bookPrice) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
	    return "Book ID: " + bookId +
	           ", Title: " + bookTitle +
	           ", Author: " + bookAuthor +
	           ", Price: " + bookPrice;
	}

}
