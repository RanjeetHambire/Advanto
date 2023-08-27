package task;

import java.util.Scanner;

public class arithmatic_printing {
	static int sum(int a, int b) {
		int Result = a + b ;
		System.out.println(Result);
		return Result;
	}
	
	static void average(int Result) {
		float avg = Result/2;
		System.out.println(avg);
	}
	

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Enter Value A: ");
			int A = sc.nextInt();
			System.out.println("Enter Value B: ");
			int B = sc.nextInt();
			
			int Result=sum(A,B);
			average(Result);
			
			
		}

	}

}
