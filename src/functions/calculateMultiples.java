package functions;
import java.util.*;
public class calculateMultiples {
	
	public static int calculateMultiple(int a, int b) {
		int multi = a * b ;
		return multi;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			
			int calculate = calculateMultiple(a,b);
			System.out.println(calculate);
		}
		

	}

}
