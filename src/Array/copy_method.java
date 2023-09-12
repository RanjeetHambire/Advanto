package Array;

public class copy_method {

	public static void main(String[] args) {
		int arr[] = new int[] {1,3,5,7,8};
		int b[] = new int[arr.length];
		
		System.arraycopy(arr,0,b,0,arr.length);
		
		for(int s:b) {
			System.out.println(s);
		}

	}

}
