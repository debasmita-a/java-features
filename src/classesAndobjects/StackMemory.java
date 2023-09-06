package classesAndobjects;

public class StackMemory {
	
	public static void t1() {
		System.out.println("t1 method");
		t2();
	}
	
	public static void t2() {
		System.out.println("t2 method");
		t3();
		
	}
	public static void t3() {
		System.out.println("t3 method");
		//m1(); cannot access a non - static property in static method.
	}

	public void m1() {
		int i = 10;
		System.out.println("m1 method");
		m2(); //m1, m2 and m3 can call each other without creating any more objects.
		StackMemory.t1();
		t3(); 
	}
	
	public void m2() {
		int i = 20;
		System.out.println("m2 method");
		m3();
	}
	
	public void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		
		StackMemory obj = new StackMemory();
		obj.m1();

	}

}
//main()->m1()->m2()->m3() : Execution chain/ Method chaining
//main() method reside in CMA. 
//m1, m2, m3 are part of Heap memory and part of object.
//In order to call m1 or m2 or m3 from main , it has to create an object.
//During execution of the program, main() and all other methods will be given space in Stack,when called.
//Allocation and Deallocation - stack memory.
//Once execution is done, de-allocation will be done (JVM) in reverse order - m3 memory will be released first
//then m2, m1 and then main method. - LIFO
//For local variables, they will be stored in Stack memory, as the methods are called, and will be released when 
//method execution is completed.

//Heap memory allocation/de-allocation is more complicated than Stack.
