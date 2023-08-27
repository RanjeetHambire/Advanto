package recursion;

public class printingNum1 {

	public static void printN(int n) {
		if(n==6) {
			return;
		}
		
		System.out.println(n);
		printN(n+1);
	}
	
	public static void main(String[] args) {
		int n = 1;
		printN(n);
	}

}
