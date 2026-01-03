package com.fourpillarsimplementation.librarymanagementsystem;

public class LibraryTest {
    public static void main(String[] args) {

        LibraryItem item1 = new Book(1, "Java Basics", "James Gosling");
        LibraryItem item2 = new DVD(2, "Inception", "Christopher Nolan");
        LibraryItem item3 = new Magazine(3, "The Chronicle", "C.S. Lewis");
        
        Reservable r1 = (Reservable) item1;
        Reservable r2 = (Reservable) item2;
        Reservable r3 = (Reservable) item3;


        r1.checkAvailability(); // true
        r1.reserveItem();

        r2.checkAvailability(); // true
        r2.reserveItem();
        
        r3.checkAvailability(); // true
        r3.reserveItem();
    }
}
