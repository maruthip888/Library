package java_real;

public class Applicaton {
public static  void main(String[] args) {
	//parent class object
	LibraryItem item1=new LibraryItem("123","Java","Maruthi");
	item1.displayInfo();
	System.out.println("----------------------------------------");
	
	
	
	
	//child class book and we create an object 
	book book1 = new book("456","DSA","Maruthi",1000);
	book1.displayInfo();
	System.out.println("----------------------------------------");
	
	
	
	
    // child class Magazine
    Magazine magazine1 = new Magazine("789", "OOPs", "Maruthi", 91);
    magazine1.displayInfo();
    System.out.println("--------------------------------------------------");

    
    
   //object of the child class
	Ebook name=new Ebook("789","oops","maruthi",456,895);
	name.displayInfo();
	//explicitly convert
	//Here we use the function with the return type
	System.out.println("The fees structure is : "+ name.getinfraStucture());
	//Here we use the function without the return type
	name.getFees();
	System.out.println("----------------------------------------");
	
}
}
