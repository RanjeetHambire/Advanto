package loop;

import java.util.Scanner;

public class facWithwhile {

	public static void main(String[] args) {
		int i = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter no: ");
			int n = sc.nextInt();
			int fact = 1;
			while(i<=n) {
				fact=fact*i;
				i++;
			}
			System.out.println(fact);
		}

	}

}
