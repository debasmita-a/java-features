package programs;

import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int fact = factorial(num);
		System.out.println(fact);

	}
	
	public static int factorial(int num) {
		int factorialSum = 1;
		for(int i=1; i<=num; i++) {
			factorialSum = factorialSum * i;
		}
		
		return factorialSum;
	}

}
