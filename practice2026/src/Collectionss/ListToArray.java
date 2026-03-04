package Collectionss;

import java.util.ArrayList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
	
		List <String>list = new ArrayList<String>();
		list .add("Hello");
		list.add("jobber");
		list.add("cafe");
		
		String[]arr= new String[list.size()];
		for(int i =0;i<list.size();i++) {
			arr[i] = list.get(i);
		}
		for(String str :arr) {
			System.out.println(str);
		}

	}

}
