package task;

// By using Switch case 

import java.util.Scanner;

public class weekdays {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter weekdays");
			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wensday");
				break;
				
			case 4:
				System.out.println("Thusday");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
				
			case 6:
				System.out.println("Satday");
				break;
				
			case 7:
				System.out.println("Sunday");
				break;
				
			default:
				System.out.println("Out of week Days");
				break;
			}
		}
	}

}
