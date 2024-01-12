package programs;

import java.util.Scanner;

public class SumOfMaxMin {

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
		
		System.out.println(sumMaxMin(array));

	}
	
	public static int sumMaxMin(int a[]) {
		int sum = 0;
		int max = a[0];
		int min = a[0];
		for(int i=1; i<a.length; i++){
			if(max<a[i]) {
				max = a[i];
			}
			
			if(min>a[i]) {
				min = a[i];
			}
		}
		sum = max + min;
		
		return sum;
	}

}
