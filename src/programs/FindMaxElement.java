package programs;

public class FindMaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int findMax(int a[]) {
		int max = a[0];
		
		for(int i =0; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		
		return max;
	}

}
