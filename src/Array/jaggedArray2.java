package Array;

public class jaggedArray2 {

	public static void main(String[] args) {
		int array[][]=new int[3][];
		array[0] = new int[3];
		array[1] = new int[2];
		array[2] = new int[4];
		
		int element = 1;
		for(int i =0; i<array.length; i++) {
			for (int j = 0; j<array[i].length;j++){
				array[i][j] = element;
				element++;
			}
		}
		
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}

	}

}
