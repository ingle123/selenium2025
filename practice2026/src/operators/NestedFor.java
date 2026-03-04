package operators;

public class NestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		for (int i =0;i<=3;i++ ) {
			System.out.println("Iteration "+i);
		for(int j= 0; j<=num;j++) {
			System.out.println(j);
		}
			
		}
	}

}
