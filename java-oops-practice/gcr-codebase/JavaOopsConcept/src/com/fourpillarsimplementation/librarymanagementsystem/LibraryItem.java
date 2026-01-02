package com.fourpillarsimplementation.librarymanagementsystem;

public abstract class LibraryItem {

    int itemId;
    String title;
    String author;

    // state (encapsulated)
    private boolean isIssued = false;
    private boolean isReserved = false;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // abstract method
    public abstract int getLoanDuration();

    // concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // protected helpers (for subclasses)
    protected boolean isIssued() {
        return isIssued;
    }

    protected boolean isReserved() {
        return isReserved;
    }

    protected void issueItem() {
        isIssued = true;
    }

    protected void reserve() {
        isReserved = true;
    }
}

     

