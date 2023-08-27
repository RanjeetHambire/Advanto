package task;

import java.util.Scanner;

public class task_doWhile {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i, a;
		do {
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Pelindrom Number");
            System.out.println("2. ArmString Number");
            System.out.println("3. Fibonacci Series");
            System.out.println("4. Factorial");
            System.out.println("5. Exit");
			i = sc.nextInt();
			
			if(i != 5) {
				
				switch(i) {
				case 1:
					int r,sum=0,temp;  
					System.out.println("Enter the number");
					int n=sc.nextInt() ;
					  
					temp=n;    
					while(n>0){
						r=n%10;    
					    sum=(sum*10)+r;    
					    n=n/10;    
					}    
					  if(temp==sum)    
					   System.out.println(" It is palindrome number ");    
					  else    
					   System.out.println("It is not palindrome"); 
					  
					break;
				case 2:
					
					break;
				case 3:
					
					int d =0, e=1, count;
					System.out.println("Enter count upto");
					count=sc.nextInt();
					System.out.print(d + " " + e);
					for(int j = 2; j < count; j++) {
						int f = d+e;
						System.out.print(" " + f);
						d = e;
						e = f;
					}
					break;
					
				case 4:
					
					System.out.println("Enter the number");
					a = sc.nextInt();
					int fact = 1;
					for(int j= 1; j<=a ; j++) {
						fact = fact * j; 
					}
					System.out.println(fact);
					break;
					
				default:
					System.out.println("Enter valid number");
					continue;
				}
			}
			
		} while(i != 5);
		System.out.println("Program exited.");
        sc.close();

	}

}
