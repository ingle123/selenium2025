package Constructor;

public class A {

	public static void main(String[] args) {
		A obj = new A();
		new A(10);
		A ob = new A(20,10);
		

	}
	
	public A() {
		System.out.println("Hello Users");
	}
	public A (int a) {
		System.out.println("Addition "+(a+a));
	}
	public A (int a, int b) {
		System.out.println("substraction   "+(a-b));
	}

}
