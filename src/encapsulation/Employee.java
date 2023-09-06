package encapsulation;

public class Employee { //implementation class

	private String name;
	private int age;
	private double salary;
	private String address;
	
	public static String empBand;
	public String companyName;
	
	//a constructor can be used to initialize private variables. (limiting unnecessary object creation)
	//A setter method can be used to update values of the private variables,
	//instead of creating new objects
	
	public Employee(String name, int age, double salary, String address) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	
	//private properties- variables and methods can only accessed within the same class
	//protected properties - can be accessed within same package 
	
	public void m1() {
		name = "Test name";
	}
	
	private void m2() {
		
	}
	
	public static void p1() {
		
	}
	
	private static void p2() {
		
	}
//////////////////////////////////////////////////////////	
	public static void n1() {
		System.out.println("static method.n1");
		//n2(); - non static method
		empBand = "E2";
		//companyName = "HCL";
	}
	
	public void n2() {
		System.out.println("non static method.n2");
		n1();
		empBand = "E1";
		companyName = "Wipro";
	}
///////////////////////////////////////////////////////////////////
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
