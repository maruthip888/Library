package java_real;
//library is the parent classs
public class LibraryItem {
public String Id;
private String title;
protected String author;

public LibraryItem(String Id,String title,String author) {
	this.Id=Id;
	this.title=title;
	this.author=author;
}
// Method to display details
public void displayInfo() {
	System.out.println("Id : "+this.Id);
	System.out.println("Title : "+this.title);
	System.out.println("author : "+this.author);
}
//we can use an private method
private void searchitems(String name) {	
System.out.println("Searching");
}
//we can use one proteced nethod
protected void searchAllitems(String name) {
System.out.println("Id : "+this.Id);
this.searchitems(name);
}
}




