package com.inheritance.singleinheritance.librarymanagement;

public class LibraryDemo {
    public static void main(String[] args) {

        Author a1 = new Author(
            "Java Basics",
            2021,
            "Ramesh Kumar",
            "Software developer and trainer"
        );

        a1.displayInfo();
    }
}
