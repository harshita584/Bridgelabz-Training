package com.keywords;

public class Library {
	   public static void main(String[] args) {
	       // Set the library name (static variable)
	       Book.setLibraryName("knowledge Hub Library");
	       // Display the library name
	       Book.displayLibraryName();
	       // Create a new book instance
	       Book book1 = new Book("Let Us C", "Yashwant Kanetkar", "978-0134685991");
	       // Display book details
	       book1.displayBookDetails();
	   }
	}

