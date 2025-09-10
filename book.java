package java_real;
//book is the derived class or child classs
public class book extends LibraryItem {
	private int pages;
	public book(String Id,String title,String author,int pages) {
		super(Id,title,author);
		this.pages=pages;
	}
	//@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("No of pages are : "+this.pages);
	}
	}
	
