package Recursion;

public class atopowerboptimized {
    public static void main(String[] args) {
        System.out.println(pow(2,6));
    }
    public static int pow(int a, int b){
        if(b==0) return 1;
        int call= pow(a,b/2);
        if(b%2==0) return call*call;
        else return a*call*call;
    }
}
