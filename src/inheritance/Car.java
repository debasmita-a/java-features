package inheritance;

public class Car extends Vehicle{

	public final void service() { //final keyword prevents method to be overriden in child class
		//A class using final keyword cannot be a parent class
		//final keyword is used for constant values
		System.out.println("Car class - service method");
	}
	public void start() {
		System.out.println("Car class - start method");
	}
	
	public void wheels() {
		System.out.println("Car class - wheels method");
	}
	
	public void stop() {
		System.out.println("Car class - stop method");
	}
	
	public void refuel() {
		System.out.println("Car class - refuel method");
	}
	//Override
	public void petrolEngine() {
		System.out.println("Car class - petrolEngine method");
	}
	
	public static void billing() {
		System.out.println("Car class - billing method");
	}
	
	private void logo() {
		System.out.println("Car class - logo method");
	}
}
