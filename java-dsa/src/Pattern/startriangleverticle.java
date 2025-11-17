package Pattern;

import java.util.Scanner;

public class startriangleverticle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        //method 1
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if ((i+j)>n) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }
        //method 2
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}