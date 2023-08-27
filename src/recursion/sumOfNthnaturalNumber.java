package recursion;

public class sumOfNthnaturalNumber {

	public static void sumOfNaturalNumber(int i, int n, int sum ) {
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return;
		}
		sum += i;
		sumOfNaturalNumber(i+1, n, sum);
				
	}
	
	public static void main(String[] args) {
		sumOfNaturalNumber(1,2,0);
	}

}
