package com.senla.task.bookstore.comparators;

import java.util.Comparator;

import com.senla.task.bookstore.interfaces.IComparator;
import com.senla.task.bookstore.model.*;


public class Comp implements IComparator{
	
	public static Comparator<Book> BookTitleComparator() {
        return new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        };
    }
	  public static Comparator<Book> BookPublDateComparator() {
          return new Comparator<Book>() {
              @Override
              public int compare(Book b1, Book b2) {
                  return b1.getPublicationDate().compareTo(b2.getPublicationDate());
              }
          };
      }
	  public static Comparator<Book> BookPriceComparator() {
		  return new Comparator<Book>() {
			  @Override
              public int compare(Book b1, Book b2) {
				  return Integer.compare(b1.getPrice(), b2.getPrice());
			  }
		  };
	  }
	  
	  public static Comparator<Apply> ApplyTitleComparator() {
		return new Comparator<Apply>() {
			 @Override
             public int compare(Apply a1, Apply a2) {
				  return a1.getBook().getTitle().compareTo(a1.getBook().getTitle());
			  }
		};
		  
	  }
	  
	  public static Comparator<Order> OrderCompletionDateComparator() {
		  return new Comparator<Order>() {
			  @Override
			  public int compare(Order a1, Order a2) {
                  if (a1.getCompletionDate() == null || a2.getCompletionDate() == null) {
                      return 0;
                  }
                  return a1.getCompletionDate().compareTo(a2.getCompletionDate());
              }
		  };
	  }
	  
	  public static Comparator<Order> OrderPriceComparator(){
		  return new Comparator<Order>() {
			  @Override
              public int compare(Order a1, Order a2) {

                  return Integer.compare(a1.getPrice(), a2.getPrice());
              }
		  };
	  }
	  
	
	  
    } 