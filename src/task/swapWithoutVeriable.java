package task;

import java.util.Scanner;

// Swamping element without using third variable

public class swapWithoutVeriable {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b;
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("A = " + a);
			System.out.println("B = " + b);
			
			a = a + b;
			b = a - b;
			a = a - b;
			
			System.out.println("After Swapping");
			
			System.out.println("A = " + a);
			System.out.println("B = " + b);
		}

	}

}
