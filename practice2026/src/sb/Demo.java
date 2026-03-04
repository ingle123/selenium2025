package sb;

public class Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0;i<100;i++) {
			sb.append(i).append(" ");
		}
		
		sb.append("\n");
		
		for(int i = 100;i>1;i--) {
			sb.append(i).append(" ");
		}
		System.out.println(sb.toString());
		
		
		
		
		
	}
}
