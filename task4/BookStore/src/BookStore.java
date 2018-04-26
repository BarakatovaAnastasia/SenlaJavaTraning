import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class BookStore {

	public static void main(String[] args) {
		Book book1 = new Book("sherlock", "author1", 500, LocalDate.of(1985, Month.JULY, 20), true);
		Book book2 = new Book("anna", "author2", 300, LocalDate.of(1995, Month.APRIL, 20), true);
		Book book3 = new Book("germini", "author3", 1500, LocalDate.of(2005, Month.NOVEMBER, 20), false);
		Book[] books = new Book[]{book1, book2, book3};
		Order[] orders = new Order[] {};
		App[] apps = new App[] {};
		Store store = new Store(books, orders, apps);
		Service service = new Service(store);
		System.out.println("Sort by name: \n"+Arrays.toString(service.sortByTitleBooks()));
		System.out.println("sort by publication date: \n"+Arrays.toString(service.sortByDateBooks()));
		System.out.println("sort by price: \n"+Arrays.toString(service.sortByPriceBooks()));
		System.out.println("Start massiv: \n " + Arrays.toString(books));
		
	}

}
