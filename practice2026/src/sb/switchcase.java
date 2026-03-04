package sb;

public class switchcase {
	public static void main(String[] args) {

//		1. Chicken Biryani
//		2. Veg Biryani
//		3. Veg Pulao
//		4.
		
		int selection = 1;
		
		switch (selection) {
		case 1:
			System.out.println("you selected chivken biryani");
			break;
		case 2:
			System.out.println("you selected veg biryani");
			break;
		case 3:
			System.out.println("you selected pulao");
			break;	
		default:
			System.out.println("Invalid selection");
			break;
		}
		
		
	}

}
