package Array;

public class doubledimensionalarr {

	public static void main(String[] args) {
		
		int [] []arr= {{1,28,6,9,85},{40,56,85,89}};
		int sizeouter =arr.length;
		for(int i =0;i<sizeouter;i++) {
			
			int size = arr[i].length;
			for(int j=0;j<size;j++) {
				System.out.println(arr[i][j]);
                  // System.out.println(arr[j][i]);


			}
		}

	}

}
