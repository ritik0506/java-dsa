package Recursion;

public class factorialofno {
    public static void main(String[] args) {
       int x= fact(5);
        System.out.println(x);
    }
    public static int fact(int n){
        if(n==0 || n==1) return 1;
        int ans=n*fact(n-1);
        return ans;
    }
}
