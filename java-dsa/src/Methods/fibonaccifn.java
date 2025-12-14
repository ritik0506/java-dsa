package Methods;

import java.util.Scanner;

public class fibonaccifn {
    public static void fib(int n){
        int a=0, b=1;
        for (int i=1;i<=n;i++){
            int temp=a;
            System.out.println(a);
            a=a+b;
            b=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        fib(n);
    }
}
