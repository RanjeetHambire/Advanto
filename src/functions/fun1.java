package functions;

import java.util.Scanner;

public class fun1 {
	
	public static void printName(String name) {
		System.out.println(name);
		return;
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name: ");
			String name = sc.next();
			name = name.toUpperCase();
			
			printName(name + " Hello Ji, Namaste");
		}

	}

}
