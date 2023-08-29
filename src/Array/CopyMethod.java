package Array;

import java.util.Arrays;

// Arrays.copyOfRange return copy of original array with starting and ending point

public class CopyMethod {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= new int[]{2,8,5,7,3,2};
		Arrays.sort(arr);
		 int b[] = Arrays.copyOfRange(arr, 0, 4);
		 for(int s:b) {
			 System.out.println(s);
		 }
		

	}
}
