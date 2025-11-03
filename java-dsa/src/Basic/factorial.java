package Basic;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int i=1;
        int fact=1;
        //using while
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println(fact);
    }
}
