package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(234,65,3789,2934,99);
		System.out.println(nums);
		System.out.println("Size of list: "+nums.size());
		Collections.sort(nums);
		System.out.println("Sorted list of nums: "+nums);
		Collections.reverse(nums);
		System.out.println("Reverse sorted list of nums: "+nums);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		System.out.println(nums2);
		System.out.println("Size of arraylist: "+nums2.size());
		
		nums2.add(567);
		nums2.add(88);
		nums2.add(9900);
		nums2.add(21);
		System.out.println(nums2);
		System.out.println("Size of arraylist: "+nums2.size());
		Collections.sort(nums2);
		System.out.println("Sorted list of nums: "+nums2);
		Collections.reverse(nums2);
		System.out.println("Reverse sorted list of nums: "+nums2);
		
		/*
		 * for(int e : nums2) { e = e*2; nums2.add(e); System.out.println(nums2);
		 * System.out.println(e); } System.out.println(nums2);
		 */
		
		for (int i=0; i<nums2.size(); i++) {
			nums2.set(i, nums2.get(i)*2);
			}	
		System.out.println(nums2);
		
		for(int i = nums2.size()-1; i>=0; i--) {
			System.out.println(nums2.get(i));
			//nums2.set(i, nums2.get(i));
		}
		
	
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("May", "June", "August", "Jane", "April"));
		
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		
		
		ArrayList<String> myList = new ArrayList<String>(Collections.nCopies(10, "Poobies"));
		System.out.println(myList.size());
		System.out.println(myList);
	

	}

}
