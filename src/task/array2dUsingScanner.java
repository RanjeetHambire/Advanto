package task;

import java.util.Scanner;

public class array2dUsingScanner {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of row:");
			int row = sc.nextInt();
			System.out.println("Enter number of Column:");
			int col = sc.nextInt();
			
//		Initializing array 
			
			int array[][] = new int[row][col];
			
			System.out.println("Enter the element");
			for(int i=0; i<row;i++) {
				for(int j=0; j<col;j++) {
					array[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("Matrix");
			for(int i=0; i<row;i++) {
				for(int j=0; j<col;j++) {
					System.out.print(array[i][j]+ " ");
				}
				System.out.println();
			}
		}
		

	}

}
