package task;

import java.util.Scanner;

public class greaterNumber {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a, b,c ;
            System.out.println("Enter the value of A: ");
            a = sc.nextInt();
            System.out.println("Enter the value of B: ");
            b = sc.nextInt();
            System.out.println("Enter the value of C: ");
            c = sc.nextInt();

            if(a==b && b==c){
                System.out.println("All are equall");
            } else if(a==b && b>c){
                System.out.println(" A and B are equall and greater than c");
            }else if(b==c && b>a){
                System.out.println("B and C are equall and greater than A");
            }else if(a==c && c>b){
                System.out.println("B and C are equall and greater than A");
            }else if(a>b && a>c){
                System.out.println("A is greater");
            }else if(b>c){
                System.out.println("B is greater");
            }else{
                System.out.println("C is greater");
            }
        }
    }
}
