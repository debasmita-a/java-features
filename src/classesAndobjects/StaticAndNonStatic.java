package classesAndobjects;

public class StaticAndNonStatic {

	//Static - Static
	//Static - Non static
	//Non static - Static
	//Non static - non static
	String name;
	int age;
	double salary;
	
	static int yoj;
	static String companyName;
	
	public static void methodStatic() {
		System.out.println("Static method.");
		//methodNonStatic(); //static - non static
	}
	public void methodNonStatic() {
		System.out.println("Non static method.");
		methodStatic(); //non static - static
	}
	
	public static void main(String[] args) {
		StaticAndNonStatic obj = new StaticAndNonStatic();
		
		obj.methodNonStatic();
		//obj.methodStatic();
		
		StaticAndNonStatic.methodStatic();
		//StaticAndNonStatic.methodNonStatic();
		
		

	}

}
