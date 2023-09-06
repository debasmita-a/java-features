package constructors;

public class ConstructorConcepts {

	int age ;
	String name;
	double salary;
	//when no constructors are defined, compilers adds default constructor
	public ConstructorConcepts(String name, int age, double salary) {
		//System.out.println("Constructor- without params");
		
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	//"this" keyword can access the class variables.
	//constructors can be used to initialize global/class variables
	public ConstructorConcepts(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public ConstructorConcepts(String name) {
		this.name = name;
		//System.out.println("Constructor - with 1 param");
	}
	public static void main(String[] args) {
		
		ConstructorConcepts obj = new ConstructorConcepts("Pooby", 6, 30.98);
		ConstructorConcepts obj1 = new ConstructorConcepts("Cooco");
		//ConstructorConcepts obj2 = new ConstructorConcepts();
		
		
		System.out.println(obj.name + "====="+ obj.age + "====="+ obj.salary);
		System.out.println(obj1.name + "====="+ obj1.age + "====="+ obj1.salary);
		
		

	}

}

//Usage of parametized constructors - mandatory fields on a form

