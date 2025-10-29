package Basic;

import java.util.Scanner;

public class leastofthreenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter thr first no");
        int a= sc.nextInt();
        System.out.println("enter the second no");
        int b=sc.nextInt();
        System.out.println("enter the third no");
        int c= sc.nextInt();
        if(a>b||c>b){
            if(a<c){
                System.out.println("third no is greater");
            }else{
                System.out.println("first no is greater");
            }
        }else{
            System.out.println("second no is greater");
        }
    }
}
