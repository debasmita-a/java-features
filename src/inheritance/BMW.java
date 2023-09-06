package inheritance;

public class BMW extends Car{

	@Override //Compiler cannot take decision which method to 
	public void start() {
		System.out.println("BMW class - start method");
	}
	
	//@Override - it is an individual method to BMW class
	public void autoParking() {
		System.out.println("BMW class - autoparking method");
	}
	@Override
	public void petrolEngine() {
		System.out.println("BMW class - petrolEngine method");
	}
	
	//@Override - static methods cannot be overridden 
	//Method hiding - same method available in parent class, same available in child class, but not overridden
	public static void billing() {
		System.out.println("BMW class - billing method");
	}
	
	//@Override
	private void logo() {
		System.out.println("BMW class - logo method");
	}
}

//Overridden methods - method signature - same name, same return type, same input, same sequence
//RUntime polymorphism 
//2 states - compile state and runtime 
//