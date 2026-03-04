package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int a = 10;
		int b = a++; //Postincrement means first asign then increment 
		System.out.println(b);
		System.out.println(a);
		
		int c = 5;
		int d = ++c;
		System.out.println(d); //Preincrement means first increment then assign
		System.out.println(c);
		
		
		int e = 20;
		int f = e++;
		e++;
		System.out.println(f);
		System.out.println(e);
		
		
		int j = 98;
		int k = ++j;
		++j;
		System.out.println(k);
		System.out.println(j);
	
		int l = 100;
		int m = l--;
		System.out.println(m);
		System.out.println(l);
		
		
		int n = 102;
		int o = --n;
		System.out.println(n);
        System.out.println(o); 
		
	}

}
