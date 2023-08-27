package loop;

import java.util.Scanner;

public class doWhile_example1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter The Number");
			int i = sc.nextInt();
			do {
				System.out.print(i + " ");
				i++;
			}while(i<=100);
		}

	}

}
