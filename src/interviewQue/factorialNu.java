package interviewQue;
import java.util.Scanner;
public class factorialNu {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter NO: ");
			int n = sc.nextInt();
			int fact = 1;
			for(int i= 1; i<=n ; i++) {
				fact = fact * i;
//				System.out.println(fact); // if we want to iterate all value after all value 
			}
			System.out.println(fact);
		}

	}

}
