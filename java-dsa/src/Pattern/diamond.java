package Pattern;

import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        //first half diamond
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        //opposite pyrimid
        for (int i=n;i>=1;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
