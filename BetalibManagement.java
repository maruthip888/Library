package java_real;

public class BetalibManagement implements libManagement {
	public void init() {
		System.out.println("Intialize the lirary with all types book");
	}
	public void checkin() {
		System.out.println("students once visited, they have to log in logbook");
		} 
	public void checkout() {
		System.out.println("if the student log out then students must sign in the log out book");
	}
	public void displayStatus() {
		System.out.println("Display the status how much students spend their time in the library");
	}
	
}
