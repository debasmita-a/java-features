package arrays;

import java.util.Arrays;

public class ArrayLiterals {

	public static void main(String[] args) {
		
		//Create arrays with new keyword
		
		int a[]= new int[4];
		
		a[0] = 5;
		a[3] = 888;
		a[1] = 67;
		a[2] = 6677;
		//a[4] = 89000; //ArrayIndexOutOfBoundsException
		//a[-1] = 9090; //ArrayIndexOutOfBoundsException
		
		System.out.println("Length of array is: "+a.length); //length is not a function, it is a property of array.
		for (int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(a); //it appends the address of the array
		
		System.out.println(Arrays.toString(a));
		
		//Create arrays without new keyword--array literals
		
		int b[]= {445,44555,23,4,9090};
		
		System.out.println("Size of array is : "+b.length );
		
		for (int j = 0; j<= b.length-1; j++) {
			System.out.println(b[j]);
		}
		
		System.out.println(Arrays.toString(b));
		
		String browsers[] = {"chrome", "safari", "IE", "edge"};
		
		browsers[4]= "firefox";
		
		System.out.println("Printing all browser names: ");
		for(String browser : browsers) {
			System.out.println(browser);
		}
		
		System.out.println(Arrays.toString(browsers));
		
        char vowels[] = {'a', 'e', 'i', 'o', 'u'};	
        
        System.out.println(Arrays.toString(vowels));
        
        double values[]= new double[5];
        
        values[3] = 4.55;
        values[1] = 889.09;
        
        System.out.println(Arrays.toString(values));
        
        //Limitations of Arrays: Size is fixed. 
        //Runtime exception: ArrayIndexOutOfBoundsException
        //Static data structure
        
	}

}
