package recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n =sc.nextInt();
			
			int output = Calfibonacci(n);
			System.out.println(output);
		}
	}
	public static int Calfibonacci(int n){

        if( n <= 0 ){
            return 0;
        } else if( n == 1){
            return 1;
        }else{
            return Calfibonacci(n-1) + Calfibonacci(n-2);
        }

    }

}
