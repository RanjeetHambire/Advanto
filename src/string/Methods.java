package string;
import java.util.Scanner;

public class Methods {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name:");
			String name = sc.nextLine();
			
			System.out.println("Enter your name:");
			String str = sc.nextLine();
//		System.out.println(name);
			
//		charAt() - gives char at given index
			System.out.println(name.charAt(1));
			
//		length() - gives length of string
			System.out.println(name.length());
			
//		toUpperCase() - convert to uppercase
			System.out.println(name.toUpperCase());
			
//		toLowerCase() - convert into lowercase 
			System.out.println(name.toLowerCase());
			
//		concat() - used for cooncatinating of two string 
			System.out.println(name.concat(str));
			
//		equals() - gives boolean value if equals 
			System.out.println(name.equals(str));
			
//		split() - used for spliting string
			System.out.println(name.split(","));
			
//		indexOf() - gives index of given char
			System.out.println(name.indexOf('z'));

//		compareTo() - used for compairing two string
			System.out.println(name.compareTo(str));
			
//		concatinating of string 
			System.out.println(name + " " + str);
			
//		replace() - used to replace all appearance of char
			System.out.println(name.replace('a', 'A'));
			
//		join() - used to join string with symbol
			System.out.println(String.join("#", name, str));
			
//		substring() -gives substing 
			System.out.println(name.substring(4));
			System.out.println(name.substring(2,5));
			
//		trim() - used to remove space at starting and Ending
			System.out.println(name.trim());
		}
		

	}

}
