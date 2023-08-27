package task;

import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
    	
    	try (Scanner sc = new Scanner(System.in)) {
			int a= sc.nextInt();
			 if(a%2==0){
			    System.out.println("A is the Even");
			 }else {
			    System.out.println("A is Ood");
			 }
		}
    }
}
