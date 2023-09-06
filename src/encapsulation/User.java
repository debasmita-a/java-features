package encapsulation;

public class User {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Cooco",6,30.33,"also cabinets");
		
		
		//emp.name = "Pooby";
		
		emp.setName("Pooby"); 
		emp.setAge(5);
		emp.setSalary(20);
		emp.setAddress("cabinets");
		
		Employee emp1 = new Employee("Cooco",6,30.33,"also cabinets");
		
		System.out.println("Name of employee : "+emp1.getName());
		System.out.println("Age of employee : "+emp1.getAge());
		System.out.println("Salary of employee : "+emp1.getSalary());
		System.out.println("Address of employee : "+emp1.getAddress());
		

	}

}

//Encapsulation - private var + public getter and setter
//private var + public constructor
//private methods + access them inside a public method

//Installation of a software

//if everything is exposed - not user friendly
//public shouldn't be able to access to the implementation

