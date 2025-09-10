package java_real;

public class Application {
public static void main(String[] args) {
	AlphalibManagement app; //Declaring variable of type AlphalibManagement
	app=new AlphalibManagement();//Create an object of type AlphalibManagement and assign to app variable
	//common object method:AlphalibManagement app = new AlphalibManagement();
	
	libManagement app2;//Declaring variable of type libManagement
	app2 = new AlphalibManagement();// create an object of type AlphalibManagement and assign to app2
	app2.init();
	app2.checkin();
	app2.checkout();
	app2.displayStatus();
	
	System.out.println("--------------------------------------------------------------");
	
	libManagement app3;//Declaring variable of type libManagement
	app3= new BetalibManagement();// create an object of type BetalibManagement and assign to app3
	
	app3.init();
	app3.checkin();
	app3.checkout();
	app3.displayStatus();
	System.out.println("--------------------------------------------------------------");
	System.out.println("**************************************************************");
	System.out.println("_______________________________________________________________");
	
	
	
	//we can also use if else condition
	libManagement appHandler;//Declaring variable of type libManagement
	boolean isAplha= false;//Hardcoding the flag, but this could be read from config or run line
	
	if(isAplha == true) {
		appHandler = new AlphalibManagement();
	}
	else {
		appHandler = new BetalibManagement();
	}
	appHandler.init();
	appHandler.checkin();
	appHandler.checkout();
	appHandler.displayStatus();
}
}
