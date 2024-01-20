package immutableClasses;

public class App {

	public static void main(String[] args) {
	
		/*
		 * Student student1 = new Student("Debasmita", 001); Student student2 = new
		 * Student("Debasmita", 001);
		 * 
		 * System.out.println(student1.equals(student2));
		 * 
		 * System.out.println(student1); System.out.println(student2);
		 * 
		 * student1.setStudentName("Debu"); System.out.println(student1);
		 */
		
		Address address1 = new Address("Bls", "Odisha");
		
		Student student = new Student("Debasmita", 101, address1);
		//student.setId(1);
		//student.setStudentName("Debasmita");
		
		System.out.println(student);
		System.out.println(address1);
		System.out.println(student.hashCode());
		System.out.println(address1.hashCode());
		
		Address address2 = student.getAddress();
		address2.setCity("Lko");
		address2.setState("UP");
		
		System.out.println(student);
		System.out.println(address2);
		System.out.println(student.hashCode());
		System.out.println(address2.hashCode());
		
		
	}

}
