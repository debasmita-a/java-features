package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
	
	public static int array[];

	public static void main(String[] args) {
		CreateArray(4);
		System.out.println(ArraySize(array));
		array[0]= 99;
		array[1]= 78;
		array[2] = 892;
		array[3] = 23;
		
		PrintArray(array);
		
		

	}

	public static void CreateArray(int size) {
		array = new int[size];
	}
	
	public static int ArraySize(int array[]) {
		return array.length;
	}
	
	public static void InsertingValues(int array[]) {
		
	}
	
	public static void PrintArray(int array[]) {
		System.out.println(Arrays.toString(array));
	}
	
	
	
}
