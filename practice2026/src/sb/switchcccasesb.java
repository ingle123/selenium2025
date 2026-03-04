package sb;

public class switchcccasesb {

	public static void main(String[] args) {
		switchcccasesb cs = new switchcccasesb();
		int number = 4;
		String result = cs.NumbertoWords(number);
		System.out.println(result);
		
		}
		private String NumbertoWords(int number) {
			switch (number) {
			case 1:
				return "one";
			case 2:
				return "two";
			case 3:
				return "three";
			case 4:
				return "four";
			default:
					return "Number not present";
			
			
			}
			
		}
		
	}


