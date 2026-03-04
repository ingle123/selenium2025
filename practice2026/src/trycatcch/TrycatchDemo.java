package trycatcch;

public class TrycatchDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
			System.out.println("Divion "+a/b);
			
		} catch (Exception e) {
			System.out.println("cannot divisible by zero");
		}

		

	}

}
