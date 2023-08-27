package recursion;

public class printNum {

	public static void printSeries(int n) {
		if(n==0) {
			return;
		}
		System.out.print(n + " ");
		printSeries(n-1);
	}
	
	
	public static void main(String[] args) {
		int n = 5;
		printSeries(n);
	}

}
