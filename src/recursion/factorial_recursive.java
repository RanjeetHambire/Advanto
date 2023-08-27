package recursion;

public class factorial_recursive {

	public static int calFactorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		int cal_facto = calFactorial(n-1);
		int cal_fac = n * cal_facto;
		return cal_fac;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int ans = calFactorial(n);
		System.out.println(ans);

	}

}
