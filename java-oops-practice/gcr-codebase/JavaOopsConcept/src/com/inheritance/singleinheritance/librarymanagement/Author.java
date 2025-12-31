package com.inheritance.singleinheritance.librarymanagement;

class Author extends Book {
    String name;
    String bio;

    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);   // calling parent constructor
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();   // calling parent method
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
