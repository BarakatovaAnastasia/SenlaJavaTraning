import java.util.Comparator;

public class Comp {
	
	public static Comparator<Book> TitleComparator() {
        return new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getTitle().compareTo(b2.getTitle());
            }
        };
    }
	  public static Comparator<Book> PublDateComparator() {
          return new Comparator<Book>() {
              @Override
              public int compare(Book b1, Book b2) {
                  return b1.getPublicationDate().compareTo(b2.getPublicationDate());
              }
          };
      }
	  public static Comparator<Book> PriceComparator() {
		  return new Comparator<Book>() {
			  @Override
              public int compare(Book b1, Book b2) {
				  return Integer.compare(b1.getPrice(), b2.getPrice());
			  }
		  };
	  }
	  
    } 