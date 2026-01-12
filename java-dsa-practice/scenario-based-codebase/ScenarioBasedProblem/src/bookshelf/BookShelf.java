package bookshelf;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


public class BookShelf {
  HashMap <String, List<Book>> libraryCatalog;   // genre -> book list
  HashSet <Book> bookSet;    // to avoid duplicates
   
  public BookShelf() {
	libraryCatalog = new HashMap<>();
	bookSet = new HashSet<>();
}

  
  // add book to the library
  void addBook(Book book, String genre)
  {
	  // if the hashset already contains the book
	  if(bookSet.contains(book))
	  {
		  System.out.println("Duplicate book not allowed.");
		  return;
	  }
	  
	  // if the hashset do not contains the book 
	  List<Book> bookList = libraryCatalog.getOrDefault(genre, new LinkedList<>());
	  
	  // adding book to linked list of genre
      bookList.add(book);
		  
	  // adding genre and linkedlist to the libraryCatalog hashMap
	  libraryCatalog.put(genre, bookList);
	  
	  // adding book to bookset
	  bookSet.add(book);
  }
	
  
  // borrow book from the library
  void borrowBook(Book book, String genre)
  {
	  if(libraryCatalog.containsKey(genre))
	  {
		  List<Book> bookList = libraryCatalog.get(genre);
		  if(bookList.contains(book))
		  {
			  bookList.remove(book);
			  bookSet.remove(book);
		  }
		  else {
			System.out.println("Book not available");
		}
		}
	  else {
			System.out.println("Genre not found");
	  }
  }
  
  
  // return book to the library
  void returnBook(Book book, String genre)
  {
	  if(bookSet.contains(book))
	  {
		  System.out.println("Book already exist");
		  return;
	  }
	  
	  List<Book> bookList = libraryCatalog.getOrDefault(genre, new LinkedList<>());
	  bookList.add(book);
	  libraryCatalog.put(genre, bookList);
	  bookSet.add(book);
  }
  
  
  // display the library
  void displayCatalog()
  {
	  for(String genre : libraryCatalog.keySet())
	  {
		  System.out.println("Genre: " + genre);
		  for(Book book : libraryCatalog.get(genre))
		  {
			  System.out.println(book);
		  }
	  }
  }
  
  
	public static void main(String[] args) {
		// constructors to initialize hashmap and hashSet
		
		BookShelf oShelf = new BookShelf();
		// creating objects for the library
		Book b1 = new Book(101, "Revolution 2020", "Chetan Bhagat", 300.00);
		Book b2 = new Book(201, "Let Us C", "Yashwant Kanetkar", 350.00);
		Book b3 = new Book(301, "Game of Thrones", "R.R. Martin", 499.00);
		Book b4 = new Book(402, "Pride and Prejudice", "Jane Austen", 399.00);
		Book b5 = new Book(501, "Head First Java", "Kathy Sierra", 550.00);
		Book b6 = new Book(601, "The Alchemist", "Paulo Coelho", 350.00);
		Book b7 = new Book(902, "The Lord of the Rings", "J. R. R. Tolkien", 899.00);
		Book b8 = new Book(701, "Sapiens", "Yuval Noah Harari", 599.00);
		Book b9 = new Book(702, "Guns, Germs and Steel", "Jared Diamond", 699.00);
		Book b10 = new Book(602, "Harry Potter", "J. K. Rowling", 499.00);

		// add books to the shelf
		oShelf.addBook(b1, "Romance");
		oShelf.addBook(b2, "Education");
		oShelf.addBook(b3, "Fantasy");
		oShelf.addBook(b4, "Romance");
		oShelf.addBook(b5, "Education");
        oShelf.addBook(b6, "Fiction");
        oShelf.addBook(b7, "Fantasy");
        oShelf.addBook(b8, "History");
        oShelf.addBook(b9, "History");
        oShelf.addBook(b10, "Fiction");
		
		oShelf.displayCatalog();
		System.out.println();
		oShelf.borrowBook(b3, "Romance");
		oShelf.displayCatalog();
		System.out.println();
		oShelf.returnBook(b3, "Romance");
		oShelf.displayCatalog();
		System.out.println();
	}

}
