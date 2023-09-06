package classesAndobjects;

public class EmployeeTest {

	String name;
	int age;
	
	public int add(int a, int b) {
		return a+b;
	}
	
	public void employeeInfo(EmployeeTest ob) {
		
		ob.name = "Pooby";
		ob.age = 2;
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String[] args) {
		
		EmployeeTest obj = new EmployeeTest();
		int value = obj.add(20, 30); // call by value
		System.out.println(value);
		
		obj.employeeInfo(obj);

	}
	
	

}
