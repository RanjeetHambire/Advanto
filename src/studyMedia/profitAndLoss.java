package studyMedia;

import java.util.Scanner;

public class profitAndLoss {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Cost Price");
			int cp = sc.nextInt();
			System.out.println("Enter Selling Price");
			int sp= sc.nextInt();
			int result;
			
			if(sp > cp){
			    result = sp -cp ;
			    System.out.println("profit: " + result);
			    
			}else if(sp < cp){
			    result = cp -sp;
			    System.out.println("loss: "+  result);
			}
		}

	}

}
