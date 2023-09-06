package classesAndobjects;

public class ClassB {

	public static void main(String[] args) {
		
		System.out.println("Calling Class B main method");
		ClassA.main(args);

	}

}

//The main(args) method calling from both Class A and Class B will result in StackOverflow exception.