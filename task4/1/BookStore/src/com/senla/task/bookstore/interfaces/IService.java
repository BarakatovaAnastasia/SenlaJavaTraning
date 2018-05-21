package com.senla.task.bookstore.interfaces;

import java.time.LocalDate;
import java.util.ArrayList;

import com.senla.task.bookstore.model.Book;
import com.senla.task.bookstore.model.Order;
import com.senla.task.bookstore.store.Store;

public interface IService {
	
	public ArrayList<Book> allBooks();
	
	public void addBook(Book book);
	
	public void removeBook(Book book);
	
	public void setBookStore(Store store);
	
	public ArrayList<Book> sortByTitleBooks();
	
	public ArrayList<Book> sortByDateBooks();
	
	public ArrayList<Book> sortByPriceBooks();
	
	public ArrayList<Order> showOrdersByPeriod(LocalDate t1, LocalDate t2);
	
	

}
