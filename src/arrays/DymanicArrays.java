package arrays;

import java.util.ArrayList;

public class DymanicArrays {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();// PC = 0, VC = 10
		
		list.add(20);//no generic type
		list.add(30);
		
		int lengthList = list.size();
		
		System.out.println(list);
		
		//Virtual Capacity- Java provides virtual capacity for ArrayList. 
		//Current Physical capacity is the size of ArrayList
		//VC = Current PC/2 will be added by Java-- Load factor of ArrayList
		

	}

}
