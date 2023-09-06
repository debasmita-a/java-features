package encapsulation;

public class AmazonLogin {

	public static void main(String[] args) {
		
		//registration
		LoginPage login = new LoginPage("Pooby","1234rty");
		
		//login
		login.doLogin(login.getUsername(), login.getPassword());
		
		//reset password
		login.setPassword("test123");
		
		System.out.println("======================");
		login.doLogin(login.getUsername(), login.getPassword());
		System.out.println("======================");
		
		//another user--
		
		LoginPage login2 = new LoginPage("Cooco","ytyt576");
		login.doLogin(login2.getUsername(), login2.getPassword());
		
		

	}

}
