package strings;

public class StringPoolVsObjects {

	public static void main(String[] args) {
		String a = "Storm Weilder";
		String b = "Storm Weilder";
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println("============================");
		
		String c = new String("Storm Weilder");
		String d = new String("Storm Weilder");
		
		System.out.println(c==d);
		System.out.println(c.equals(d));
		
		System.out.println("============================");
		System.out.println(a==c);
		System.out.println(a.equals(c));
		

	}

}
