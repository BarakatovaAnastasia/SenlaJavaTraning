package com.senla.task.bookstore.store;

import com.senla.task.bookstore.model.Book;

import java.time.LocalDate;
import java.util.ArrayList;

import com.senla.task.bookstore.interfaces.IStore;
import com.senla.task.bookstore.model.Apply;
import com.senla.task.bookstore.model.Order;
import com.senla.task.bookstore.model.enumerations.OrderStatus;

public class Store implements IStore{
	private ArrayList<Book> books; 
    private ArrayList<Order> orders;
    private ArrayList<Apply> apps;
    
    public Store() {
        this.books = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.apps = new ArrayList<>();
    }
    public ArrayList<Book> getAllBooks() {
        return books;
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    public ArrayList<Apply> getAllAppsOnBook(Book book) {
        ArrayList<Apply> appsOnBook = new ArrayList<>();
        for (Apply app : apps) {
            if (app.getBook().equals(book)) {
            	appsOnBook.add(app);
            }
        }
        return appsOnBook;
    }
        
    public void removeBook(Book book) {
    	books.remove(book);
    }
    
    public void addApply(Apply app) {
    	apps.add(app);
    }
    
    
    public void addOrder(Order order) {
    	orders.add(order);
    }
    
    public ArrayList<Order> getAllOrders() {
		return orders;
	}
    
    public void removeOrders(Order order) {
    	orders.remove(order);
    }
    
    public void completeOrder(Order order) {
    	order.setStatus(OrderStatus.Done);
    }
    
   
    
    
   
}
