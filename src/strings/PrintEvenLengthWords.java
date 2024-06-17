package strings;

public class PrintEvenLengthWords {

	public static void main(String[] args) {
		printOnlyEvenLengthWords("I love Java so much but not more than Selenium");
	}
	
	public static void printOnlyEvenLengthWords(String s) {
		s = s.trim();
		String[] words = s.split(" ");
		for(String word : words) {
			int len = word.length();
			if(len%2 == 0) {
				System.out.println(word);
			}
		}
	}
}
