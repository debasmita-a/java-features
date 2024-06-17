package strings;

public class IntialsWithSurname {

	public static void main(String[] args) {
		initialWithSurname("Pankaj Kumar Singh");
		getInitials("pankaj Kumar Singh");

	}
	
	public static void initialWithSurname(String name) {
		System.out.println(name);
		int len = name.length();
		//removing leading and trailing spaces
		name = name.trim();
		//to store extracted words
		String str1 = "";
		
		for(int i=0; i<len; i++) {
			char ch = name.charAt(i);
			if(ch!= ' ') {			
				str1 = str1 + ch;
			}else {
				System.out.print(Character.toUpperCase(str1.charAt(0))+ ". ");
				str1 = "";
			}
		}
		
		String str2 = "";
		for(int j=0; j<str1.length(); j++) {
			if(j == 0) {
				str2 = str2 + Character.toUpperCase(str1.charAt(0));
			}else {
				str2 = str2 + Character.toLowerCase(str1.charAt(j));
			}
		}	
		System.out.println(str2);
		
	}
	
	public static void getInitials(String name) {
		if(name.length() == 0) {
			return;
		}		
		//split the string using space
		String[] words = name.split(" ");
		for(String word : words) {
			System.out.print(Character.toUpperCase(word.charAt(0))+ " ");
		}
	}

}
