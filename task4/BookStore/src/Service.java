import java.util.Arrays;

public class Service {
	
	private Store store;
	
	public Service(Store store) {
		this.store = store;
	}
	
	public void setBookStore(Store store) {
        this.store = store;
    }
	public Book[] sortByTitleBooks() {
		Book[] books = store.getBooks().clone();
        Arrays.sort(books, Comp.TitleComparator());
        return books;
	}
	public Book[] sortByDateBooks() {
		Book[] books = store.getBooks().clone();
		Arrays.sort(books, Comp.PublDateComparator());
		return books;
	}
	public Book[] sortByPriceBooks() {
		Book[] books = store.getBooks().clone();
		Arrays.sort(books, Comp.PriceComparator());
		return books;
	}
}
