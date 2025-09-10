package java_real;

public class Ebook extends book {
	private int bookStructer;
	public Ebook(String Id, String title, String author, int pages,int BookStructer ) {
		super(Id, title, author, pages);
		this.bookStructer=BookStructer;
	}
	
	//here we are not overriding but we can conert by explicitly
	//Here we use the function with the return type
	public int getinfraStucture() {
		return bookStructer;
	}

	//Here we use the function without the return type
	public void getFees() {
		System.out.println("The fees Structure :"+bookStructer);
	}
}
