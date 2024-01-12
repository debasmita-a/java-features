package programs;

import java.util.Scanner;

public class SumOfElements {

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
		
		System.out.println(sumOfElement(array));

	}
	
	public static int sumOfElement(int a[]) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			//sum = sum + a[i];
			sum+=a[i];
		}
		
		return sum;
	}

}
