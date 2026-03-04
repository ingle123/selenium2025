package trycatcch;

public class trycatch2 {

	public static void main(String[] args) {
	
		
		try {
			int[]arr = new int[2];
			arr[0] = 1;
			arr[1] = 2;
            arr[2] = 3;
            arr[3] = 4;
            int size = arr.length;
            for(int i= 0;i<size;i++) {
            	System.out.println(arr[i]);
            }
            
		}catch (Exception e) {
				System.out.println("inserstion extra element int array of size");
			}
            		
			
		
	}

}
