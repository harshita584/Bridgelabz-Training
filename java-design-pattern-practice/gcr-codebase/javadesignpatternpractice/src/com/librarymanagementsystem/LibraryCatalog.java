package com.librarymanagementsystem;

import java.util.*;

public class LibraryCatalog {
	private static LibraryCatalog instance;
	private List<Book> books = new ArrayList<>();
	private List<Observer> observers = new ArrayList<>();
	
	private LibraryCatalog() {}
	
	public static synchronized LibraryCatalog getInstance() {
		if(instance == null) instance = new LibraryCatalog();
		return instance;
	}
	
	public void addBook(Book book) {
		books.add(book);
		newBookArrived(book.getTitle());
	}
	
	private void newBookArrived(String bookName) {
		for (Observer o : observers) {
			o.update("New book available: " + bookName);
		}
	}
	
	public void addObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
}
