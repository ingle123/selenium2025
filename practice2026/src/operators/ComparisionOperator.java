package operators;

public class ComparisionOperator {

	public static void main(String[] args) {
		
		boolean check ;
		
		int a = 10;
		int b = 20;
		int c = 10;
		check = (a==b);
		System.out.println("a is equal equal to b");
		System.out.println(check);
		
		
		check = (a<b);
		System.out.println("a is less than b");
		System.out.println(check);
		
		check = (a>b);
		System.out.println("a is Greater than b");
		System.out.println(check);
		
		check = (a<=c);
		System.out.println("a is less than equal to b");
		System.out.println(check);
		
		check = (a>=c);
		System.out.println("a is Greater than  equal to b");
		System.out.println(check);


	}

}
