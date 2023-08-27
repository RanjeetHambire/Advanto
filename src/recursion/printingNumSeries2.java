package recursion;

public class printingNumSeries2 {

	public static int printSeries(int i ,int n) {
		if(i == n || i >= 10) {
			return 0;
		}
		return i + printSeries(i+2, n);
	}
	public static void main(String[] args) {
		int n = 5;
		int result = printSeries(0 , n);
		System.out.println(result);

	}

}
