package encapsulation;

public class LoginPage {

	private String username;
	private String password;
	
	public LoginPage(String username, String password) {
		//super();
		this.username = username;
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void doLogin(String username, String password) {
		
		System.out.println("Enter username "+ username);
		System.out.println("Enter password "+ password);
		System.out.println("Click Enter/Login button.");
		System.out.println("User is logged in.");
		
		if(isUserActive(username)) {
			System.out.println("User is active.");
		}else {
			System.out.println("User is blocked.");
		}
	}
	
	private boolean isUserActive(String username) {
		System.out.println("Checking user status.."+ username);
		return true;
	}
	
}
