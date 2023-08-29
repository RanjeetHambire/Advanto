package task;
import java.util.Arrays;
import java.util.Scanner;
public class arrayTask1 {

//	taking value of array from user and sorting them 
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the size of the array: ");
			int n = sc.nextInt();
			
			int arr[]=new int[n];
			
			System.out.println("Enter the Element of array:");
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			System.out.println("Sorting array is");
			
			for(int s: arr) {
				System.out.print(s + " ");
			}
		}

	}

}
