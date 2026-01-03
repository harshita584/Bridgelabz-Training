package com.objectmodeling.booksandlibrary;

public class AggregationDemo {
    public static void main(String[] args) {

        // Books created independently
        Book b1 = new Book("Let Us C", "Yashwant Kanetkar"); 
        Book b2 = new Book("Clean Code", "Robert C. Martin");

        // Two libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Adding books to libraries
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b1); // same book added to another library

        // Display library contents
        lib1.displayBooks();
        lib2.displayBooks();
    }
}
