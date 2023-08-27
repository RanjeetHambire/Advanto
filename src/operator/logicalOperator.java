package operator;

import java.util.Scanner;

public class logicalOperator {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println((a>b) && (a<b));
			System.out.println((a>b) || (a<b));
		}
		

	}

}
