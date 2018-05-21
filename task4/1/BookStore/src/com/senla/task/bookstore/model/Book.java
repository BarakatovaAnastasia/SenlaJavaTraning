package com.senla.task.bookstore.model;

import java.time.LocalDate;

import com.senla.task.bookstore.interfaces.IBook;


public class Book implements IBook {
	private String title;
	private String author;
	private int price;
	private LocalDate publicationDate;
	private boolean status; //is there in stock
	public int num;
	
	public Book(String title, String author, int price, LocalDate publicationDate, boolean status) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.publicationDate = publicationDate;
		this.status = status;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public LocalDate getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
        return "Title: "+this.title+" "+"Author: "+this.author +" "+
        			"Publication Date: "+this.publicationDate+" "+"Price: "+this.price+"\n";
        
    }
}

