package strings;

public class StringManipulations {

	public static void main(String[] args) {
		String s1  = "abcedef";
		int len = s1.length();
		char[] c1 = new char[len];
		char[] c2 = s1.toCharArray();
		
		for( int i=0; i<c1.length; i++) {
			c1[i] = s1.charAt(i);
		}
		
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
