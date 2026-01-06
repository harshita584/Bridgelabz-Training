package com.linkedlist.doublylinkedlist;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;

    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieManagementSystem{

    private MovieNode head;
    private MovieNode tail;

    // add at the beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // add movie at the end
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // add movie at specific position
    public void addAtPosition(int position, String title, String director, int year, double rating) {
        if (position <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        int count = 1;

        while (temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // remove movie by title
    public void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                } 
                else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } 
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found!");
    }

    // search by director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for this director.");
    }

    // search by rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with this rating.");
    }

    // display forward
    public void displayForward() {
        MovieNode temp = head;

        if (temp == null) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println("Movies (Forward Order):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // display reverse
    public void displayReverse() {
        MovieNode temp = tail;

        if (temp == null) {
            System.out.println("No movies available.");
            return;
        }

        System.out.println("Movies (Reverse Order):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }

    // update movie rating
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Movie not found!");
    }

    // display single movie
    private void displayMovie(MovieNode m) {
        System.out.println("Title: " + m.title +
                ", Director: " + m.director +
                ", Year: " + m.year +
                ", Rating: " + m.rating);
    }
}


public class MovieApp {
    public static void main(String[] args) {

        MovieManagementSystem mms = new MovieManagementSystem();

        mms.addAtEnd("Inception", "Christopher Nolan", 2010, 9.0);
        mms.addAtBeginning("Titanic", "James Cameron", 1997, 8.5);
        mms.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.8);
        mms.addAtPosition(2, "Avatar", "James Cameron", 2009, 7.9);

        mms.displayForward();
        mms.displayReverse();

        mms.searchByDirector("Christopher Nolan");
        mms.searchByRating(8.5);

        mms.updateRating("Avatar", 8.2);
        mms.removeByTitle("Titanic");

        mms.displayForward();
    }
}
