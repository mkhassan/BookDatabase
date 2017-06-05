
public class BookApp {

	public static void main(String[] args) {
	BookDatabase booksdatabase = new BookDatabase();
	
	Book mybook =  booksdatabase.retrieveBook("Java1001");
	
	System.out.println(mybook.getDisplayText());
	
	

		
		
	
	}

}
