package com.senla.task.bookstore.model;

public class Apply {
	
	private String name;
	private Book book;
	private boolean status;
	
	public Apply(String name, Book book, boolean status) {
		this.name = name;
		this.book = book;
		this.status = status;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBook(Book book) {
		this.book = book;
	}
	public Book getBook() {
		return book;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean getStatus() {
		return status;
	}
	
	public void setNum(int num) {
		book.num = book.num + 1; 
	}
	public int getNum() {
		return book.num;
	}
}
