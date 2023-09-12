package string;

import java.util.Scanner;

public class ReverseString {
	
//	             first method 

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String: ");
//		String str= sc.nextLine();
//		String rev = "";
//		char ch ;
//		
//		for(int i = 0; i<str.length();i++) {
//			ch = str.charAt(i);
//			rev = ch + rev;
//		}
//		System.out.println(rev);
//
//	}

//            Second Method	
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String: ");
			String str = sc.nextLine();
			String rev = "";
			char ch;
			
			for(int i= str.length() - 1; i>=0 ; i--) {
				ch = str.charAt(i);
				rev += ch;
			}
			System.out.println(rev);
		}
	}
	
}
