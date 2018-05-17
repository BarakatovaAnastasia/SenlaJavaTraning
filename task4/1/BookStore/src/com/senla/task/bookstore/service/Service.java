package com.senla.task.bookstore.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import com.senla.task.bookstore.model.*;
import com.senla.task.bookstore.model.enumerations.OrderStatus;
import com.senla.task.bookstore.store.Store;
import com.senla.task.bookstore.comparators.Comp;


public class Service {
	
	private Store store;
	
	public Service(Store store) {
		this.store = store;
	}
	
	public ArrayList<Book> allBooks(){
		return store.getAllBooks();
	}
	
	public void addBook(Book book) {
		store.addBook(book);
	}
	
	public void removeBook(Book book) {
		store.removeBook(book);
	}
	
	
	
	public void setBookStore(Store store) {
        this.store = store;
    }
	public ArrayList<Book> sortByTitleBooks() {
		ArrayList<Book> books = (ArrayList<Book>)store.getAllBooks().clone();
        Collections.sort(books, Comp.BookTitleComparator());
        return books;
	}
	
	public ArrayList<Book> sortByDateBooks() {
		ArrayList<Book> books = (ArrayList<Book>)store.getAllBooks().clone();
		Collections.sort(books, Comp.BookPublDateComparator());
		return books;
	}
	public ArrayList<Book> sortByPriceBooks() {
		ArrayList<Book> books = (ArrayList<Book>)store.getAllBooks().clone();
		Collections.sort(books, Comp.BookPriceComparator());
		return books;
	}
	
	 
	 public ArrayList<Order> showOrdersByPeriod(LocalDate t1, LocalDate t2){
	    	ArrayList<Order> allOrders = store.getAllOrders();
	    	ArrayList<Order> ordersForPeriod = new ArrayList<>();
	    	for (Order ord: allOrders) {
	    		if (ord.getStatus() == OrderStatus.Done && ord.getCompletionDate().isAfter(t1)  
	    				&& ord.getCompletionDate().isBefore(t2)) {
	    					ordersForPeriod.add(ord);
	    		}
	    	}
	    	return ordersForPeriod;
	    }
	    
}
