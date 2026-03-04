package polymorphism;

public class Overloading {

public static void main(String[] args) {

     Overloading over = new Overloading();
     over.addition(10);
     over.addition(40, 80);
     over.addition(50, 1.5f);
     over.addition(6.6f,1.2f);
     over.addition(1.5f, 78);
    
}

	public void addition(int a) {
		System.out.println(a+a);

	}
	public void addition(int a , int b) {
		System.out.println(a+b);
	}

	public void addition(int a , float b) {
		System.out.println(a+b);
	}

	public void addition(float a , int b) {
		System.out.println(a+b);
	}
	public void addition(float a  ,float  b) {
		System.out.println(a+b);
	}


	}
