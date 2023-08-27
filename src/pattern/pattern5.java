package pattern;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Value: ");
			int row = sc.nextInt();
			for(int i=1; i<=row;i++) {
				for(int j=1;j<=row;j++) {
					if(j==2 || j==4 || j==6 || j==8 || j==10) {
						System.out.print("&");
					}else {
						System.out.print("#");
					}
				}
				System.out.println();
			}
		}
	}

}

//#&#&#
//#&#&#
//#&#&#
//#&#&#
//#&#&#