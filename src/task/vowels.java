package task;

import java.util.Scanner;

public class vowels {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter variable");
			char ch = sc.next().charAt(0);
			ch =  Character.toLowerCase(ch);
			switch(ch) {
			case 'a': 
			case 'e': 
			case 'i': 
			case 'o':
			case 'u':
				System.out.println("Its the vowel");
				break;
			
			default:
				System.out.println("not vowel");
				
}
		}
	}

}
