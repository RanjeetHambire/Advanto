package task;

import java.util.Scanner;

//Swapping element by using third variable 

public class swapingElement {
	public static void main(String args[]) {
		try (Scanner sc = new Scanner(System.in)) {
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();

			System.out.println("A = " + a);
			System.out.println("B = " + b);

			c = a;
			a = b;
			b = c;
			System.out.println("After Swapping");
			
			System.out.println("A = " + a);
			System.out.println("B = " + b);
		}
		
	}
}
