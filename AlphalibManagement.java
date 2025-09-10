package java_real;

public class AlphalibManagement implements libManagement {
	
	public void init() {
		System.out.println("Alpha,Intialize the lirary");
	}
	public void checkin() {
		System.out.println("Alpha,Students once visited they have to loggin");
		}
	
	public void checkout() {
		System.out.println("Alpha,If the student went out then students must log out");
	}	
	public void displayStatus() {
		System.out.println("Alpha,Display the status how much students spend their time in the library");

	}
}
