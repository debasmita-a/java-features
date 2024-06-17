package hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateWordsOccurrences {

	public static void main(String[] args) {
		getDuplicateWordsCount("word is that word contains lots of words and thus word is good.");
	}

	public static void getDuplicateWordsCount(String str) {
		str = str.trim();
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for(String word : words) {		
			Integer count = map.get(word);
			//if(count == null) { // if(map.contains(word))
			if(map.containsKey(word)) {
				map.put(word, count + 1);
				//map.put(word, 1);
			}else {
				//map.put(word, count + 1);
				map.put(word, 1);
			}
		}
		
		System.out.println(map);
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();	
		Iterator<Entry<String, Integer>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<String, Integer> e = it.next();
			System.out.println(e.getKey() + " ============== " + e.getValue());
			if(e.getValue()>1) {
				System.out.println("Printing only duplicate words " + e.getKey());
			}
		}	
		
	}
}
