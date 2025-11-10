package Pattern;

import java.util.Scanner;

public class starcross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        //rows
        for (int i=1;i<=n;i++){
            //column
            for (int j=1;j<=n;j++){
                //condition
                //n-i-1 means for row 2:- 5-2+1=4
                if (i==j||j==((n-i)+1)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
