package string;

import java.util.Scanner;

public class EqualIgnoreCase {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 1st String:");
			String str1 = sc.nextLine();
			System.out.println("Enter 1st String:");
			String str2 = sc.nextLine();
			
			System.out.println(str1.equalsIgnoreCase(str2));
		}
		}
}
