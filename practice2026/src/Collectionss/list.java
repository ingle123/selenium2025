package Collectionss;

import java.util.ArrayList;
import java.util.List;

public class list {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(15);
		list.add(64);
		list.add(85);
		System.out.println(list);
		
		
		List<String> strlist = new ArrayList();
		strlist .add("jobbers");
		strlist.add("cafe");
		strlist.add("jobbers");
		strlist.add("pune");
		System.out.println(strlist);
		
		for(int i =0;i<list.size();i++) {
		System.out.println("list :"+list.get(i));
			
		}
		for(String str:strlist) {
			
			System.out.println(str);
		}
	
		
	
	}

}
