package programs;

public class ReverseANum {

	public static void main(String[] args) {
		int testNum = reverseNumWithDoWhile(103);
		System.out.println(testNum);

	}
	
	private static int reverseNum(int num) {
		int revNum=0;
		
		while(num>0) {
			revNum =revNum*10 + num%10;
			num = num/10;
		}
		
		return revNum;
	}
	
	private static int reverseNumWithFor(int num) {
		int revNum=0;
		for(int i=0; num>0; i++) {
			revNum = revNum*10 + num%10;
			num = num/10;
		}
		
		return revNum;
	}
	
	private static int reverseNumWithDoWhile(int num) {
		int revNum=0;
		
	//	revNum = revNum*10 + num%10;
		do {
			revNum = revNum*10 + num%10;
			num = num/10;
		}while(num>0);
		
		return revNum;
	}

}
