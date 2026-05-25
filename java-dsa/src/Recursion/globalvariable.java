package Recursion;

public class globalvariable {
    static int x=10;

    public static void main(String[] args) {
        fun(1);
    }
    public static void fun(int n){
        if(n>x) return;
        System.out.println(n);
        fun(n+1);
    }
}
