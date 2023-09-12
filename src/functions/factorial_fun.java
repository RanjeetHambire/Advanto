package functions;
import java.util.Scanner;
public class factorial_fun {
	
	public static void calFacto(int n) {
		if (n<0) {
			System.out.println("Invlide number!");
		}
		
		int factorial = 1;
		for(int i =n; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			
			calFacto(n);
		}
	}

}
