package recursion;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int n =sc.nextInt();
			
			int output = fibonacci(n);
			System.out.println(output);
		}
	}
	public static int fibonacci(int n){

        if( n <= 0 ){
            return 0;
        } else if( n == 1){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

}
