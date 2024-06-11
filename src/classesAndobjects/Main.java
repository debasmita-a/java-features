package classesAndobjects;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Pretty", 901, 67);

		System.out.println(student1);
		System.out.println(student1.marks);
		student1.marks = 99;
		System.out.println(student1.marks);
		System.out.println(student1.name);
		
		Student[] students = new Student[3];
		System.out.println(students);
		System.out.println(Arrays.toString(students));
	}

}

class Student{
	String name;
	int rollNum;
	int marks;
	
	 Student(String name, int rollNum, int marks) {
		this.name = name;
		this.rollNum = rollNum;
		this.marks = marks;
	}
}
