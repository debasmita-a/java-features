package strings;

public class FindPalindromInStringArray {

	public void findPalindroms(String[] str) {
		String pal = "";
		for(int i=0; i<str.length; i++) {
			int m = 0; int n = str[i].length()-1;
			while(m<n) {
				if(str[i].charAt(m)==str[i].charAt(n)) {
					pal = pal + str[i].charAt(m);
				}			
				m++; n--;
			}
		}
		System.out.println(pal);;
	}
}
