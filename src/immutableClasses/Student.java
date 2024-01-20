package immutableClasses;

import java.util.Objects;

final public class Student {

	final private String studentName;
	final private int id;
	final private Address address; 

	public Student(String studentName, int id, Address address) {
		this.studentName = studentName;
		this.id = id;
		this.address = address;
	}

	public String getStudentName() {
		return studentName;
	}

	// public void setStudentName(String studentName) {
	// this.studentName = studentName;
	// }

	public int getId() {
		return id;
	}

	// public void setId(int id) {
	// this.id = id;
	// }
	

	public Address getAddress() {
		//return new Address(address.getCity(), address.getState());
		return new Address(address);
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", id=" + id + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(studentName, other.studentName);
	}

}
