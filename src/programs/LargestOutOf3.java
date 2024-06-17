package programs;

public class LargestOutOf3 {

	public static void main(String[] args) {
		System.out.println(largestNum(5674, 234, 102));
	}
	
	public static int largestNum(int a, int b, int c) {
		return c>(a>b ? a:b) ? c:(a>b ? a:b);
	}

}
