package com.senla.task.bookstore.interfaces;

import java.time.LocalDate;

public interface IBook {
	
	public String getTitle();
	
	public void setTitle(String title);
	
	public String getAuthor();
	
	public void setAuthor(String author);
	
	public int getPrice();
	
	public void setPrice(int price);
	
	public LocalDate getPublicationDate();
	
	public void setPublicationDate(LocalDate publicationDate);
	
	public boolean getStatus();
	
	public void setStatus(boolean status);
	
	public String toString();
}
