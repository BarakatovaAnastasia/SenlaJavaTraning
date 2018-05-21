package com.senla.task.bookstore.interfaces;

import java.util.Comparator;

import com.senla.task.bookstore.model.Apply;
import com.senla.task.bookstore.model.Book;
import com.senla.task.bookstore.model.Order;

public interface IComparator {
	
	public static Comparator<Book> BookTitleComparator() {
		return null;
	}
	
	public static Comparator<Book> BookPublDateComparator() {
		return null;
	}
	
	public static Comparator<Book> BookPriceComparator() {
		return null;
	}
	
	public static Comparator<Apply> ApplyTitleComparator() {
		return null;
	}
	
	public static Comparator<Order> OrderCompletionDateComparator() {
		return null;
	}
	
	 public static Comparator<Order> OrderPriceComparator() {
		return null;
	}
	 

}
