package Collectionss;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Maps {

	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<Integer, String>();
		mp.put(1,"One");
		mp.put(2, "Two");
		mp.put(3, "Three");
		mp.put(4, "Four");
		mp.put(5, "Five");
		
		for(Map.Entry<Integer, String>ent :  mp.entrySet()){
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
		
		
	}

}
