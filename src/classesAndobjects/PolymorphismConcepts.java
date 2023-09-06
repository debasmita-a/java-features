package classesAndobjects;

public class PolymorphismConcepts {

	public static void main(String[] args) {
		
		PolymorphismConcepts pc = new PolymorphismConcepts();
		
		pc.search("books", 600);
		pc.search("bags", "TH");

	}
	
	//Polymorphism:
	//Method overloading - compile time/static binding
	//and overriding-runtime/dynamic bindings
	
	public void search() {
		System.out.println("No params.");
	}
	
	public void search(String productName) {
		System.out.println("Product name: "+productName);
	}
	
	public void search(String productName, String brandName) {
		System.out.println("Product name: "+productName+" Brand name: "+brandName);
	}
	
	public void search(String productName, int price) {
		System.out.println("Product name: "+productName+" Price: "+price);
	}
	
	

}
