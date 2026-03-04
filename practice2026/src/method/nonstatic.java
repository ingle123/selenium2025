package method;

public class nonstatic {

	public static void main(String[] args) {
	nonstatic obj = new nonstatic();
	obj.addition();
	obj.substraction();
	obj.addition(50);
	obj.substraction(40,5);

	}
	public void addition() {
		int a = 10;
		System.out.println("Addition : "+(a+a));
		
	}
	public void substraction() {
		int a = 8;
		int b = 6;
		System.out.println("substraction : "+(a-b));
		
	}

public void addition (int a) {
	System.out.println("Addition : "+(a+a));
}
public void substraction(int a ,int b) {
	System.out.println("substraction : "+(a-b));
	
}
}
