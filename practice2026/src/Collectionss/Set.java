package Collectionss;

import java.util.HashSet;
import java.util.Iterator;

import operators.While;

public class Set {

	public static void main(String[] args) {
		
		HashSet  st = new HashSet();//duplicate not allowed
		st.add(10);
		st.add(50);
		st.add(45);
		st.add(50);
		st.add(10);
		st.add(null);
		st.add("hello");
		st.add("jobbers");
		st.add("cafe");
		st.add("Jobbers");
		
		System.out.println(st);
		
		
		Iterator itr =  st.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		

	}

}
