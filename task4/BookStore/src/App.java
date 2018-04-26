
public class App {
	private Book book;
	private boolean status;
	
	public App(Book book, boolean status) {
		this.book = book;
		this.status = status;
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
