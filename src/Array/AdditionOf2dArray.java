package Array;

public class AdditionOf2dArray {

	public static void main(String[] args) {
		int a [][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b [][] = {{7,8,9},{4,5,6},{1,2,3}};
		
//		initializing new array 
		int c [][] = new int [a.length][b.length];
		
//		logic for sum array 
		for(int i=0;i<a.length ; i++) {
			for(int j = 0; j<b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
//		printing sum matrix 
		
		for(int i=0;i<a.length ; i++) {
			for(int j = 0; j<b.length; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
