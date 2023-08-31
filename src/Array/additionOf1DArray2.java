package Array;

public class additionOf1DArray2 {

	public static void main(String[] args) {
		int array1[]= {4,6,2,4,6};
		int array2[]= {7,2,9,5,9};
		
//		initialising sum array 
		int sum [] = new int[array1.length];
		
//		logic for addition of two matrix
		for(int i = 0; i<array1.length; i++) {
			sum[i] = array1[i]+ array2[i];
			System.out.print(sum[i] + " ");
		}
		
		
		

	}

}
