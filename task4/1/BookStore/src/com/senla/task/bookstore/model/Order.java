package com.senla.task.bookstore.model;

import java.util.ArrayList;
import java.time.LocalDate;

import com.senla.task.bookstore.interfaces.IOrder;
import com.senla.task.bookstore.model.enumerations.OrderStatus;

public class Order implements IOrder{
	
	private Customer customer;
	private ArrayList<Book> books = new ArrayList<>();
	private OrderStatus status;
	private int price = 0;
	private LocalDate completionDate;
	
	public Order(Customer customer, LocalDate completionDate) {
		this.customer = customer;
		this.completionDate = completionDate;
	}
	
	public ArrayList<Book> getBooks() {
        return books;
    }
	public Customer getCustomer() {
        return customer;
    }
	public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }
	
	public void addBook(Book book) {
        this.books.add(book);
        this.price = this.price + book.getPrice();
    }
	
	public void removeBook(Book book) {
		this.books.remove(book);
		this.price = this.price - book.getPrice();	
	}
	
	
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
        this.status = status;
    }
	public LocalDate getCompletionDate() {
        return completionDate;
    }
	public void setCompletionDate(LocalDate completionDate) {
        this.completionDate = completionDate;
    }
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", books=" + books + ", status=" + status + ", price=" + price
				+ ", completionDate=" + completionDate + "]";
	}
	
}
