package Recursion;

public class reverseofno {
    static int ans=0;
    public static void main(String[] args) {
        rev(543);
        System.out.println(ans);
    }
    public static void rev(int n) {
        if (n == 0) return;   // base case
        int rem = n % 10;     // extract last digit
        ans = ans * 10 + rem; // build reversed number
        rev(n / 10);      // recursive call with reduced number
    }

    }
