package file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import stringss.nestedif;

public class Filewriter {

	public static void main(String[] args) throws IOException {
	
		File  file = new File("D:\\Software Testing\\sachin2026.txt");
		FileWriter fw = new FileWriter(file);
		
		String input = "hello jobbers cafe Pune phase1";
		for (int i= 0;i<input.length();i++) {
			fw.write(input.charAt(i));
	}
		fw.close();
	}
}
