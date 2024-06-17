package hashmaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharInString {

	public static void main(String[] args) {
		getDuplicateCharInString("coconut");

	}
	
	public static void getDuplicateCharInString(String s) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			Character ch = s.charAt(i);
			Integer count = map.get(ch);

			if(map.containsKey(ch)) {
				map.put(ch, count+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		System.out.println(map);
		
		Set<Entry<Character,Integer>> entrySet  = map.entrySet();
		Iterator<Entry<Character,Integer>> it = entrySet.iterator();
		while(it.hasNext()) {
			Entry<Character,Integer> entry = it.next();
			System.out.println(entry.getKey() + "----------------" + entry.getValue());
		}
	}
	
	

}
