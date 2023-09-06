package inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.autoParking(); //individual -BMW
		b.start(); //override 
		b.wheels(); //inherited 
		b.refuel(); //inherited
		b.stop(); //inherited
		b.engine();
		b.petrolEngine();//override
		BMW.billing();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.wheels();
		c.refuel();
		c.engine();
		c.petrolEngine(); 
		Car.billing();
		
		Vehicle v = new Vehicle();
		v.engine();
		v.petrolEngine();
		
		Audi a = new Audi();
		
		Car cb = new BMW(); //top casting
		System.out.println("=======================");
		cb.start();
		cb.wheels();
		cb.stop();
		cb.petrolEngine();
		//cb cannot access individual methods/properties belonging to BMW only. Reference check - compiler
		//cb.autoParking();//reference type check failed
		
		//BMW bc = new Car(); - not allowed in Java at Compile time, it fails in Runtime
		//BMW bc = (BMW)new Car(); //Runtime - ClassCastException
		
		Vehicle vb = new BMW();
		
		

	}

}
//Advantages of Inheritance - re-usability , Is - a relationship
//Child class can inherit all properties of parent.
//Parent class cannot access any properties specific to child classes
//Multi-level inheritance in Java is allowed
//Multiple inheritance in Java is not allowed

//final, static and private methods cannot be overridden

