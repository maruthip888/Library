package java_real;

public class Magazine extends LibraryItem {
	private int issueNumber;
	public Magazine(String Id, String title, String author,int issueNumber) {
		super(Id, title, author);
		this.issueNumber=issueNumber;
		}
	//we can use a method toprint the data
	public void displayInfo() {
		super.displayInfo();
		System.out.println("The issued number is : "+this.issueNumber);
	}

}
