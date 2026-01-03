package com.fourpillarsimplementation.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued() && !isReserved();
    }

    @Override
    public void reserveItem() {
        if (checkAvailability()) {
            reserve();
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is not available.");
        }
    }
}

