package string;
import java.util.Scanner;

public class Reverse_Individual {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:=>");
		String str = sc.nextLine();
		String rev ="";
		String str1[] = str.split(" ");
		
		for(int i=str1.length-1; i>=0; i--) {
			rev += str1[i] + " ";
		}
		System.out.println(rev);
		
	
	}
}
