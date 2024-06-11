package strings;

public class ReverseAString {

	public static void main(String[] args) {
		//System.out.println(reverseStringWithCharArray("racecar"));
		//System.out.println(reverseAStringWithBuilder("racecar"));
		//System.out.println(reverseAStringWithBuilder("storm"));
		//System.out.println(reverseAStringUsingTwoPointers("deed"));

		FindPalindromInStringArray obj = new FindPalindromInStringArray();
		obj.findPalindroms(new String[]{"racecar", "adda", "cca", "deed"});
		System.out.println();
	}
	//string palindrome 
	
	private static boolean reverseStringWithCharArray(String str) {
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
		if(str.equals(rev)) {
			return true;
		}		
		return false;
	}
	
	private static boolean reverseAStringWithBuilder(String str) {
		StringBuilder rev = new StringBuilder(str);
		rev.reverse();
		if(str.equals(rev.toString())) {
			return true;
		}
		return false;
	}
	
	private static boolean reverseAStringUsingTwoPointers(String str) {
		int i = 0;
		int j = str.length()-1;
		
		while(i<j) {
			if(str.charAt(i) == str.charAt(j)) {
				return true;
			}
			
			i++; j--;
		}
		return false;
		
	}
	
	

}
