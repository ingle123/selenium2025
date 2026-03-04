package Collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Arraystolist {

	public static void main(String[] args) {
	
		String []str = {"Hello","Jobbers","cafe"};
		List<String> list = new ArrayList<String>(Arrays.asList(str));
		Iterator <String>itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next()  );
		}

	}

}
