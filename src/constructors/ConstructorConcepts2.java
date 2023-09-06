package constructors;

public class ConstructorConcepts2 {

	//private constructors - no other class can create object of this class
	//restriction 
	//use cases - 
	private ConstructorConcepts2() {
		System.out.println("private constructor.");
	}
	//if constructors are private, then other classes cannot access the methods which are non static.
	//static methods can only be accessed by object ref.

	public void getInfo() {
		System.out.println("non static method - accessed by obj ref name");
	}
	
	public static void setInfo() {
		System.out.println("static method - accessed by class name");
		
	}
	
	public static void main(String[] args) {
		ConstructorConcepts2 obj = new ConstructorConcepts2();

	}

}
