package programs;

import java.util.Scanner;

public class FindAnElementInArray {

	public static void main(String[] args) {
		int array[];
		int size;
		System.out.println("enter the size of the array.");
		Scanner scan = new Scanner(System.in);
		size = scan.nextInt();
		array = new int[size];
		System.out.println("Enter elements.");
		for(int i=0; i<size; i++) {
			array[i] = scan.nextInt();
		}
		
		System.out.println("Enter the element to be found.");
		int num = scan.nextInt();
		boolean result = findElement(num, array);
		
		if(result) {
			System.out.println("Element available.");
		}else {
			System.out.println("Element not available.");
		}

	}
	
	public static boolean findElement(int num, int a[]) {
		for(int i=0; i<a.length; i++) {
			if(a[i] == num) {
				return true;
			}
		}
		
		return false;
	}

}
