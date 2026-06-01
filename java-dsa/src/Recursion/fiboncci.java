package Recursion;

public class fiboncci {
    public static void main(String[] args) {
        fib(7,0,1);
    }
    public static void fib(int n,int x,int y){
        if(n==0) return;
        int i=x;
        System.out.println(i);
        int j=y;
        int c=i+j;
        i=j;
        j=c;
        fib(n-1,j,i+j);
    }
}
