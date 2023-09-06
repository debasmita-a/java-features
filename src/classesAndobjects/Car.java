package classesAndobjects;

public class Car {

	public String name; //same number of global variable copies will be created inside the Heap memory,
	//as the number of objects
	public String color;//class variables are part of object
	public double price;//non static properties cannot be called without object ref. Compiler will be confused to which copy of name to be used.
	public static final int wheels = 4; //Static variable is a class variable , only single copy of the variable will be stored
	//in memory- CMA Common Memory Allocation/Permanent Generation/Meta space - after JDK 
	//Static variable is the common property of all objects. But object will not hold the static variable.
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "Jeep";
		c1.color = "Red";
		c1.price = 40.89;
		//c1.wheels = 4; a static variable should not be accessed using the object.
		//Car.wheels = 5; a static variable should be accessed using class name
		//final variables cannot be modified 
		
		System.out.println("Care name: "+c1.name+", Car color: "+c1.color+" ,Car price: "+c1.price+", Car wheels: "+Car.wheels);

		System.out.println("Care name: "+c1.name+", Car color: "+c1.color+" ,Car price: "+c1.price+", Car wheels: "+c1.wheels);
		System.out.println("Care name: "+c1.name+", Car color: "+c1.color+" ,Car price: "+c1.price+", Car wheels: "+wheels);
		//System.out.println("Care name: "+name+", Car color: "+c1.color+" ,Car price: "+c1.price+", Car wheels: "+Car.wheels);
	}

}

//Amazon - Logo will remain same throughout the site - static property
//Home page URL - static property
//Every landing page - non static property
//Title of landing pages - non static
//Footers - same throughout the site - static property
