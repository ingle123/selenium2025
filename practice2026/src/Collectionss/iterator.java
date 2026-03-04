package Collectionss;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(10);
		list.add(45);
		list.add(78);
		list.add(56);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}

	}

}
