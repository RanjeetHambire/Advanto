package task;

import java.util.Scanner;

public class ArithmaticWithSwitchCase {

	public static void main(String[] args) {
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("** Arithmatic Value\r\n" + "1.Addtion. 2.Subtraction\r\n" + "3.Multiplication  4. Divition\r\n " + "5. Exit");
			int n = sc.nextInt();
			
			System.out.println("Enter Value A: ");
			int A = sc.nextInt();
			System.out.println("Enter Value B: ");
			int B = sc.nextInt();
			
			int Result = 0;
			
			switch (n) {
			case 1:
				Result = A + B;
//				System.out.println(Result);
				break;
				
			case 2:
				Result = A - B ;
//				System.out.println(Result);
				break;
				
			case 3:
				Result = A * B ;
//				System.out.println(Result);
				break;
				
			case 4:
				Result = A / B ;
//				System.out.println(Result);
				break;
				
			case 5:
				System.exit(0);
				break;
				
			default:
				System.out.println("Out of choice");
				break;
			} 
			
			System.out.println("Result: " + Result);
		}

	}

}
