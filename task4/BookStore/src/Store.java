public class Store {
	private Book[] books; 
    private Order[] orders;
    private App[] apps;

    public Store(Book[] books, Order[] orders, App[] apps) {
        this.books = books;
        this.orders = orders;
        this.apps = apps;
    }
    public Book[] getBooks() {
        return books;
    }
    public Order[] getOrders() {
        return orders;
    }
    public App[] getApps() {
        return apps;
    }
    
   
}
