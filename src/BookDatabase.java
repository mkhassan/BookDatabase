
import java.util.ArrayList;


public class BookDatabase {

	private ArrayList<Book> books;

	public BookDatabase() {



		books = new ArrayList<Book>();

		Book b1 = new Book("Java1001","Head First Java", "Kathy Sierra and Bert Bates", "Easy to read Java workbook", 47.50);
		Book b2 = new Book("Java1002", "Thinking in Java", "Bruce Eckel", "Details about Java under the hood", 20.00);

		Book b3 = new Book("Java1003","OCP: Oracle Certified Professional Java SE", "Jeanne Boyski", "Everything you need to know in one place", 45 );

		Book b4 = new Book("Python1004", "Automate the Boring Stuff with Python", "AI Sweigart", "Fun with Python", 10.50 );
		
		Book b5 = new Book("Python1004");
		

		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.add(b4);

	}
	public Book retrieveBook(String mysku){

		for (Book book: this.books) {
			if(book.getSku().equals(mysku)) {
				return book;//.toString();
			}
			else break;

		}

		return null; //"not found";
	}



}
