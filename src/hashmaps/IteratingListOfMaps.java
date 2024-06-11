package hashmaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class IteratingListOfMaps {

	public static void main(String[] args) {
		HashMap<String, String> map1 = new HashMap<>();
		
		map1.put("sweet name", "Bon bons");
		map1.put("sweet desc", "1st sweet name");
		map1.put("sweet price", "$1.90");
		
		HashMap<String, String> map2 = new HashMap<>();
		
		map2.put("sweet name", "Choco pies");
		map2.put("sweet desc", "2nd sweet name");
		map2.put("sweet price", "$1.95");
		
		List<HashMap<String, String>> listOfMaps = new ArrayList<HashMap<String, String>>();
		
		listOfMaps.add(map1);
		listOfMaps.add(map2);
		
		//sSystem.out.println(listOfMaps);
		
	
		Set<Entry<String, String>> entrySetAll = map1.entrySet();		
		//System.out.println(entrySetAll);
		
		Iterator<String> it = map1.keySet().iterator();
		//while(it.hasNext()) {
			//System.out.println(it.next());
		//}
		
		Iterator<Entry<String, String>>  it2 = entrySetAll.iterator();
	//	while(it2.hasNext()) {
			//System.out.println(it2.next());
		//}
		
		for(int i=0; i<listOfMaps.size(); i++) {
		//Set<Entry<String, String>> entrySET = listOfMaps.get(i).entrySet();
			Iterator<Entry<String, String>> myIt = listOfMaps.get(i).entrySet().iterator();
			
			while(myIt.hasNext()) {
				Entry<String, String> entryName = myIt.next();
				System.out.println(entryName.getKey() + "===========" + entryName.getValue());
			}
		}
		
	}

}
