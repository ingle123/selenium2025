package Collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GHeneric {

	public static void main(String[] args) {
		
		List list = new ArrayList();//This is generic means string and integer both are allowed
		list.add(10);
		list.add("Hello");
		list.add(11);
		list.add(50);
		list.add(10);
		list.add("Hello");
		list.add("Bibhu")
		
		Print(list);
	}	
		
		public static void Print(List list) {
			Iterator itr = list.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
	
		
		
		
	}

}

