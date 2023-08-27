package Array;

import java.util.Scanner;

public class arr2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of array: ");
			int n = sc.nextInt();
			
			int array[] = new int[n];
			System.out.println("Enter the element: ");
			for(int i=0; i<array.length; i++) {
				array[i] = sc.nextInt();
			}
			
			for(int i=0; i<array.length; i++) {
				System.out.print(array[i] + " ");
			}
		}
				
	}
}
