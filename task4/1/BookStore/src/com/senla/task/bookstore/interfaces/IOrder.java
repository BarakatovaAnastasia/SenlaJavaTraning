package com.senla.task.bookstore.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

import com.senla.task.bookstore.model.Book;
import com.senla.task.bookstore.model.Customer;
import com.senla.task.bookstore.model.enumerations.OrderStatus;

public interface IOrder {

	public ArrayList<Book> getBooks();
	
	public Customer getCustomer();
	
	public void setBooks(ArrayList<Book> books);
	
	public void addBook(Book book);
	
	public void removeBook(Book book);
	
	public OrderStatus getStatus();
	
	public void setStatus(OrderStatus status);
	
	public LocalDate getCompletionDate();
	
	public void setCompletionDate(LocalDate completionDate);
	
	public int getPrice();
	
	public String toString();
	
}
