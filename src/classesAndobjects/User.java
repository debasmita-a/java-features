package classesAndobjects;

public class User {

	String fName;
	String lName;
	String emailID;
	String password;
	String city;
	String phoneNo; //debit card/ adhaar card no. if we are not doing mathematical calculation, we can use String.
	
	
	//requirement : user can be created if you have the first name and last name.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	public User(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}


	public User(String fName, String lName, String emailID, String password) {
		this.fName = fName;
		this.lName = lName;
		this.emailID = emailID;
		this.password = password;
	}


	public User(String fName, String lName, String emailID, String city, String phone) {
		this.fName = fName;
		this.lName = lName;
		this.emailID = emailID;
		this.city = city;
		this.phoneNo = phone;
	}
	
	public void initializeFields(String fName) {
		this.fName = fName;
	}
	
	//why use constructors instead of methods? - only for creating objects, restriction, initializing 
	//global variables
	//we cannot restrict creation of objects using methods. 
	//BUT we cannot write business logic in a constructor. 
	//methods are features of the application
	//even if we write business logic inside constructor, it cannot return anything.
	//method has usability for business logics.
	

}
