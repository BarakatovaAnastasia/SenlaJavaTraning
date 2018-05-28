package com.senla.task.bookstore.start;

import java.time.LocalDate;
import java.time.Month;


import com.senla.task.bookstore.model.Apply;
import com.senla.task.bookstore.model.Book;
import com.senla.task.bookstore.model.Customer;
import com.senla.task.bookstore.model.Order;
import com.senla.task.bookstore.model.enumerations.OrderStatus;
import com.senla.task.bookstore.service.Service;
import com.senla.task.bookstore.store.Store;
import com.senla.task.bookstore.util.BookFileUtil;
import com.senla.task.bookstore.util.FileUtil;



public class BookStore {

	public static void main(String[] args) {
		final FileUtil<Book> util = new BookFileUtil();
		
		Book book1 = new Book("sherlock", "author1", 500, LocalDate.of(1985, Month.JULY, 20), true);
		Book book2 = new Book("anna", "author2", 300, LocalDate.of(1995, Month.APRIL, 20), true);
		Book book3 = new Book("germini", "author3", 1500, LocalDate.of(2005, Month.NOVEMBER, 20), false);
		
		Book[] books = new Book[]{book1, book2, book3};
		
		util.writeToFile(books);
		Customer customer1 = new Customer("John");
		
		Order order1 = new Order(customer1, LocalDate.of(2018, Month.MAY, 16));
		order1.setStatus(OrderStatus.Done);
		Order order2 = new Order(customer1, LocalDate.of(2017, Month.APRIL, 25));
		order2.setStatus(OrderStatus.InDelivery);
		
		Store store = new Store();
		store.addBook(book1);
		store.addBook(book2);
		store.addBook(book3);
		order1.addBook(book1);
		order1.addBook(book2);
		store.addOrder(order1);
		store.addOrder(order2);
		
		Service service = new Service(store);
		/*
		System.out.println(service.showOrdersByPeriod(LocalDate.of(2015, Month.APRIL, 15), (LocalDate.of(2019, Month.APRIL, 15))));
		
		System.out.println("Sort by name: \n"+service.sortByTitleBooks());
		System.out.println("sort by publication date: \n"+service.sortByDateBooks());
		System.out.println("sort by price: \n"+service.sortByPriceBooks());
		System.out.println("Start massiv: \n " + service.allBooks());
		*/
		
		System.out.println("initial array");
		for (int i = 0; i < books.length; i++ ){
			System.out.println(books[i]);
		}
		
		final Book[] readedValues = util.readFromFile();
		
		System.out.println("readed array");
		for (int i = 0; i < readedValues.length; i++ ){
			System.out.println(readedValues[i]);
		}
		
	}

}
