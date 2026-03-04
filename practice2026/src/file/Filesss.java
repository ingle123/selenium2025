package file;

import java.io.File;

public class Filesss {

	public static void main(String[] args) {
		
		 File file = new File("D:\\Software Testing\\EXEL2026.pub");
		 if(file.exists()) {
			 
		
		 System.out.println("File name"+file.getName());
		 System.out.println("File Absolutepath "+file.getAbsolutePath());
		 System.out.println("File path"+file.getPath());
		 }
		 else {
			 System.out.println("File doesnt exist");
		 }
	    	

	}

}
