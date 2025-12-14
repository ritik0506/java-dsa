package Methods;

import java.util.Scanner;

public class factorial {
    public static void fact(int n){
        int ans=1;
        for (int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        fact(n);
    }
}
