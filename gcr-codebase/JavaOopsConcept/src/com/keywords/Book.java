package com.keywords;

class Book {
	   // Static variable shared across all instances
	   private static String libraryName;
	   // Instance variables
	   private String title;
	   private String author;
	   private final String isbn; // Final variable to ensure immutability
	   // Constructor to initialize instance variables
	   public Book(String title, String author, String isbn) {
	       this.title = title;
	       this.author = author;
	       this.isbn = isbn;
	   }
	   // Static method to set the library name
	   public static void setLibraryName(String name) {
	       libraryName = name;
	   }
	   // Static method to display the library name
	   public static void displayLibraryName() {
	       System.out.println("Library Name: " + libraryName);
	   }
	   // Method to display book details
	   public void displayBookDetails() {
	       // Using 'instanceof' to verify the object's type before displaying details
	       if (this instanceof Book) {
	           System.out.println("Title: " + title);
	           System.out.println("Author: " + author);
	           System.out.println("ISBN: " + isbn);
	       } else {
	           System.out.println("The object is not an instance of the Book class.");
	       }
	   }
	   // Getters for instance variables (optional, but recommended for encapsulation)
	   public String getTitle() {
	       return title;
	   }
	   public String getAuthor() {
	       return author;
	   }
	   public String getIsbn() {
	       return isbn;
	   }
	}
