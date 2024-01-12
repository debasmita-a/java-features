package programs;

import java.util.Scanner;

public class FindMaxElement {

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
		
		System.out.println(findMax(array));

	}
	
	public static int findMax(int a[]) {
		int max = a[0];
		
		for(int i =1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		return max;
	}

}
