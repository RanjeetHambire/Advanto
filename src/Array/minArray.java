package Array;

//finding minimun in the given array 

public class minArray {
	public static void main(String[] args) {
		int arr []=new int[]{5,8,2,6,0,6};
		int min = arr[0];
		for(int i = 0 ; i< arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}
