package Collectionss;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Treesetss {

	public static void main(String[] args) {
		
		
		Set tr = new TreeSet();//In tree set duplicate not allowed

		tr.add(100);
		tr.add(48);
		tr.add(45);
		tr.add(100);
		tr.add(52);
		tr.add(52);
	
	
		System.out.println(tr);
		Iterator itr = tr.iterator();
		
		while(itr.hasNext()) {
		System.out.println(itr.next());


	}

}
}