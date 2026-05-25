package Recursion;



public class functioncallingitself {
    public static void name(int n) {
        if (n==0) return;
            System.out.println(n);
        name(n-1);
    }
    public static void main(String[] args) {
        name(10);
    }
}
