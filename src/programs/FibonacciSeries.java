package programs;

public class FibonacciSeries {
//find fibonacci numbers upto a certain count
	public static void main(String[] args) {
		fibonacciNums(6);

	}
	
	public static void fibonacciNums(int count) {
		int first = 1;
		int prev = 1;
		int nextNum = 2;
		for(int i=2; i<=count; i++) {
			nextNum = nextNum + prev;
			System.out.println(nextNum );
			prev = nextNum;
		}
	}

}
