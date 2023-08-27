package pattern;
import java.util.Scanner;
public class pattern3 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Value: ");
			int row = sc.nextInt();
			for(int i=1; i<=row;i++) {
				for(int j=1;j<=row;j++) {
					if(i==2) {
						System.out.print("#");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
		}
		

	}

}


//******
//######
//******
//******
//******
//******
