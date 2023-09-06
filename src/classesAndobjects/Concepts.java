package classesAndobjects;

import java.util.ArrayList;

public class Concepts {

	//Write a function, where
	//Supply a browser name
	//Business logic - Launch the browser
	//Return true
	
	public boolean launchBrowser(String browserName) {
		System.out.println("Browser name is: "+ browserName);
		boolean flag = true;
		switch(browserName.toLowerCase().trim()){
			case "edge":
				System.out.println("Launch edge.");
				break;
			case "chrome":
				System.out.println("Launch chrome.");
				break;
			case "safari":
				System.out.println("Launch safari.");
				break;
			case "ie":
				System.out.println("Launch ie.");
				break;
			default : 
				System.out.println("Please provide correct browser name. "+ browserName);
				flag = false;
				break;
		}
				
			return flag;	
	}
	
	//Write a function where;
	//Supply input param - company name
	//return employee list
	
	public static ArrayList<String> getEmployeeList(String companyName) {
		System.out.println("Company name: "+companyName);
		
		ArrayList<String> empList = new ArrayList<String>(); //PC = 0
		
		switch(companyName) {
			case "ibm":
				empList.add("Ravi");
				empList.add("Shraddha");
				//return empList;
				break;
			case "microsoft":
				empList.add("Shannon");
				empList.add("Johnny");
				break;
			default: 
				System.out.println("Please enter correct comapny name.");
				break;
		}
		
		return empList;
				
	}
	public static void main(String[] args) {
		
		Concepts c = new Concepts();
		boolean isLaunched = c.launchBrowser("opera");
		if(isLaunched) {
			System.out.println("Enter the URL.");
		}else {
			System.out.println("Do not enter the URL.");
		}
		
		System.out.println(c.getEmployeeList("ibm"));

	}

}
