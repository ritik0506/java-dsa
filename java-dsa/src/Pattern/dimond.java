package Pattern;

import java.util.Scanner;

public class dimond {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("emter the number");
        int n= Sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        int x=n-1;
        for (int j=1;j<=n;j++){
            for (int i=1;i<=j;i++){
                System.out.print(" ");
            }
            //odd number
            for(int k=1;k<=x*2-1;k++){
                System.out.print("*");
            }
            x--;
            System.out.println();
        }
    }
}
