package com.linkedlist.doublylinkedlist;

//Book node class
class Book {
 int bookId;
 String title;
 String author;
 String genre;
 boolean available;

 Book next;
 Book prev;

 Book(int bookId, String title, String author, String genre, boolean available) {
     this.bookId = bookId;
     this.title = title;
     this.author = author;
     this.genre = genre;
     this.available = available;
     next = null;
     prev = null;
 }
}

//Library class which contains all operations
class Library {

 Book head = null;
 Book tail = null;

 // add book at beginning
 void addAtBeginning(int id, String title, String author, String genre, boolean status) {
     Book newBook = new Book(id, title, author, genre, status);

     if (head == null) {
         head = tail = newBook;
         return;
     }

     newBook.next = head;
     head.prev = newBook;
     head = newBook;
 }

 // add book at end
 void addAtEnd(int id, String title, String author, String genre, boolean status) {
     Book newBook = new Book(id, title, author, genre, status);

     if (head == null) {
         head = tail = newBook;
         return;
     }

     tail.next = newBook;
     newBook.prev = tail;
     tail = newBook;
 }

 // add book at specific position
 void addAtPosition(int pos, int id, String title, String author, String genre, boolean status) {
     if (pos <= 1) {
         addAtBeginning(id, title, author, genre, status);
         return;
     }

     Book temp = head;
     int count = 1;

     while (temp != null && count < pos - 1) {
         temp = temp.next;
         count++;
     }

     if (temp == null || temp.next == null) {
         addAtEnd(id, title, author, genre, status);
         return;
     }

     Book newBook = new Book(id, title, author, genre, status);
     newBook.next = temp.next;
     newBook.prev = temp;
     temp.next.prev = newBook;
     temp.next = newBook;
 }

 // remove book by id
 void removeById(int id) {
     Book temp = head;

     while (temp != null) {
         if (temp.bookId == id) {

             if (temp == head) {
                 head = head.next;
                 if (head != null)
                     head.prev = null;
             }
             else if (temp == tail) {
                 tail = tail.prev;
                 if (tail != null)
                     tail.next = null;
             }
             else {
                 temp.prev.next = temp.next;
                 temp.next.prev = temp.prev;
             }

             System.out.println("Book removed");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Book not found");
 }

 // search book by title
 void searchByTitle(String title) {
     Book temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.title.equalsIgnoreCase(title)) {
             printBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No book found with this title");
 }

 // search book by author
 void searchByAuthor(String author) {
     Book temp = head;
     boolean found = false;

     while (temp != null) {
         if (temp.author.equalsIgnoreCase(author)) {
             printBook(temp);
             found = true;
         }
         temp = temp.next;
     }

     if (!found)
         System.out.println("No books found for this author");
 }

 // update availability
 void updateAvailability(int id, boolean status) {
     Book temp = head;

     while (temp != null) {
         if (temp.bookId == id) {
             temp.available = status;
             System.out.println("Availability updated");
             return;
         }
         temp = temp.next;
     }

     System.out.println("Book not found");
 }

 // display books forward
 void displayForward() {
     Book temp = head;

     if (temp == null) {
         System.out.println("Library is empty");
         return;
     }

     System.out.println("Books in library:");
     while (temp != null) {
         printBook(temp);
         temp = temp.next;
     }
 }

 // display books in reverse
 void displayReverse() {
     Book temp = tail;

     if (temp == null) {
         System.out.println("Library is empty");
         return;
     }

     System.out.println("Books in reverse order:");
     while (temp != null) {
         printBook(temp);
         temp = temp.prev;
     }
 }

 // count total books
 void countBooks() {
     int count = 0;
     Book temp = head;

     while (temp != null) {
         count++;
         temp = temp.next;
     }

     System.out.println("Total books: " + count);
 }

 // print one book
 void printBook(Book b) {
     System.out.println(
             "ID: " + b.bookId +
             ", Title: " + b.title +
             ", Author: " + b.author +
             ", Genre: " + b.genre +
             ", Available: " + (b.available ? "Yes" : "No")
     );
 }
}

//main class
public class LibraryApp {
 public static void main(String[] args) {

     Library lib = new Library();

     lib.addAtEnd(1, "Java Programming", "James Gosling", "Programming", true);
     lib.addAtBeginning(2, "Clean Code", "Robert Martin", "Software", true);
     lib.addAtEnd(3, "Data Structures", "Karumanchi", "Education", false);
     lib.addAtPosition(2, 4, "Operating Systems", "Galvin", "CS", true);

     lib.displayForward();
     lib.displayReverse();

     lib.searchByTitle("Clean Code");
     lib.searchByAuthor("Galvin");

     lib.updateAvailability(3, true);
     lib.removeById(1);

     lib.countBooks();
     lib.displayForward();
 }
}
