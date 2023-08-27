package loop;
import java.util.Scanner;
public class dowhile_example2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, a, b ;
		do {
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
			i = sc.nextInt();
			
			if(i != 5) {
				System.out.println("Enter 1st Number");
				a=sc.nextInt();
				System.out.println("Enter 2nd Number");
				b=sc.nextInt();
				int result = 0;
				
				switch(i) {
				case 1:
					result = a + b;
					System.out.println(result);
					break;
				case 2:
					result = a - b;
					System.out.println(result);
					break;
				case 3:
					result = a * b;
					System.out.println(result);
					break;
				case 4:
					result = a / b;
					System.out.println(result);
					break;
				default:
					System.out.println("Enter valid number");
					continue;
				}
				System.out.println("Result = " + result);
			}
			
		} while(i != 5);
		System.out.println("Program exited.");
        sc.close();

	}

}
