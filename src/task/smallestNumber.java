package task;

import java.util.Scanner;

public class smallestNumber {
    public static void main(String[] args) {

        try (Scanner var = new Scanner(System.in)) {
            int a, b,c ;
            System.out.println("Enter the value of A: ");
            a = var.nextInt();
            System.out.println("Enter the value of B: ");
            b = var.nextInt();
            System.out.println("Enter the value of C: ");
            c = var.nextInt();

            if(a==b && b==c){
                System.out.println("all are equall");
            } else if(a==b && b<c){
                System.out.println(" A nd B are equall and Less than c");
            }else if(b==c && b<a){
                System.out.println("B and C are equall and Less than A");
            }else if(a==c && c<b){
                System.out.println("B and C are equall and Less than A");
            }else if(a<b && a<c){
                System.out.println("A is Smallest Number");
            }else if(b<c){
                System.out.println("B is Smallest NUmber");
            }else{
                System.out.println("C is Smallest Number");
            }
        }
    }
}
