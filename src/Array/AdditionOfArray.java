package Array;

public class AdditionOfArray {

	public static void main(String[] args) {
		int sum= 0;
		int array[]= {6,7,8,4,3,6};
		for(int i = 0; i<array.length;i++) {
			sum += array[i];
		}
		System.out.println(sum);

	}

}
