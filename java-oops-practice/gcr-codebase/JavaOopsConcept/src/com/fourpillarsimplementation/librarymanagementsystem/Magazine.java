package com.fourpillarsimplementation.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued() && !isReserved();
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            reserve();
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is not available.");
        }
    }
}

