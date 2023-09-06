package classesAndobjects;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Method overloading :
	//same method name
	//different parameter types
	//different number of parameters
	//return type doesn't matter
	//cannot have exactly same blueprint
	
	
	public void test(String s) {
		
	}
	
	public int test(String s, int i) {
		return 0;
	}
	
	public void test(int i) {
		
	}
	
	//Uber
	
	public void getCar(String carType, String fromLocation, String toLocation) {
		
	}
	
    public void getCar(String carType, String fromLocation, String toLocation, String paymentMethod) {
		
	}
    
   public void getCar(String carType, String fromLocation, String toLocation, int passengers, String paymentMethod) {
		
	}
	
	

}
