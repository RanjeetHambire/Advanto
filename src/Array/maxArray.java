package Array;

//finding max in the given array

public class maxArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[] {5,7,9,3,5,8};
		int max = arr[0];
		for(int i=0; i < arr.length ; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
}
