package com.senla.task.bookstore.interfaces;

import java.util.ArrayList;

import com.senla.task.bookstore.model.Apply;
import com.senla.task.bookstore.model.Book;
import com.senla.task.bookstore.model.Order;

public interface IStore {

	 public ArrayList<Book> getAllBooks();
	 
	 public void addBook(Book book);
	 
	 public ArrayList<Apply> getAllAppsOnBook(Book book);
	 
	 public void removeBook(Book book);
	 
	 public void addApply(Apply app);
	 
	 public void addOrder(Order order);
	 
	 public ArrayList<Order> getAllOrders();
	 
	 public void removeOrders(Order order);
	 
	 public void completeOrder(Order order);
	 
}
