package task;

import java.util.Scanner;
public class pos_neg_zero {
	public static void main(String arg[]) {
		 try (Scanner sc = new Scanner(System.in)) {
			 
			 int a = sc.nextInt();
			 
			 if(a == 0) {
				 System.out.println("A is Zero");
			 }else if(a > 0) {
				 System.out.println("A isPositive");
			 }else {
				 System.out.println("A is negative");
			 }
		}
		 
	}
}
