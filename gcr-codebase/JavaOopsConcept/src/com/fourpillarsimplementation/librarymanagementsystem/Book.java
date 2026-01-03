package com.fourpillarsimplementation.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // days
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued() && !isReserved();
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            reserve();
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is not available for reservation.");
        }
    }
}
