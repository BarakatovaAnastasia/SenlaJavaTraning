import java.util.ArrayList;
import java.time.LocalDate;

public class Order {
	private Customer customer;
	private ArrayList<Book> books = new ArrayList<>();
	private OrderStatus status;
	private int price = 0;
	private LocalDate creationDate;
	
	public Order(Customer customer, LocalDate creationDate) {
		this.customer = customer;
		this.creationDate = creationDate;
	}
	public Customer getCustomer() {
        return customer;
    }
	public ArrayList<Book> getBooks() {
        return books;
    }
	public void addBook(Book book) {
        this.books.add(book);
        this.price = this.price + book.getPrice();
    }
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
        this.status = status;
    }
	public LocalDate getCreationDate() {
        return creationDate;
    }
	public int getPrice() {
		return price;
	}
	
}
