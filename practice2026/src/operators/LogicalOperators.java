package operators;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean check;
		
		 int a = 10;
		 int b = 20;
		 
		 check =(a<b)&(b>a);
		 System.out.println(check); //AND operator if both True then True  otherwise False
		 
		 check =(a>b)||(b<a);
		 System.out.println(check); //OR operator if both False then False otherwise True
				 
		check =!(a<b);
		System.out.println(check);
				 

	}

}
