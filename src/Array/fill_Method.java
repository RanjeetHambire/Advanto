package Array;

import java.util.Arrays;
import java.util.Scanner;

public class fill_Method {
	
//	Arrays.fill Method used to fill the array with element which provided by user 

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int size, element;
			System.out.println("Enter the size of array: ");
			size = sc.nextInt();
			
			int arr[] = new int[size];
			System.out.println("Enter the element: ");
			element = sc.nextInt();
			Arrays.fill(arr, element);
			
			System.out.print(Arrays.toString(arr));
		}

	}

}
