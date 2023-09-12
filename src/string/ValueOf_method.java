package string;

import java.util.Scanner;

//valueOf() - it convert int to str

public class ValueOf_method {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number:");
			
			int num = sc.nextInt();
			String str = String.valueOf(num);	
			System.out.println(str + 10);
		}
	}

}
