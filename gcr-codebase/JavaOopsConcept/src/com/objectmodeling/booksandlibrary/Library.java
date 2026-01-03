package com.objectmodeling.booksandlibrary;

import java.util.ArrayList;

public class Library {
    String libraryName;
    ArrayList<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        books = new ArrayList<>();
    }

    // Method to add books to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
        System.out.println();
    }
}
