package classesAndobjects;

public class StaticMethodOverloading {

	public  static void login() {
		
	}
	
	public static int login(int a) {
		return 10;
	}
	
	public static String login(String url) {
		return url;
	}
	//Static methods can be overloaded. Any method can be overloaded.
	//Static properties are stored in Metaspace (1.8 onwards). It is dynamic. If the allocated memory runs out, it uses system allocated memory space- RAM.
	//Previously , it was known as Permanent Generation. Not dynamic.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Can we overload main() method? - Yes. 
	//main() method will be stored in Metaspace.
	

}
