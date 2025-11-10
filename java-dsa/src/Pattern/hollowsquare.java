package Pattern;

import java.util.Scanner;

public class hollowsquare {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no");
        int n= sc.nextInt();
        //rows
        for (int i=1;i<=n;i++){
            //column
            for (int j=1;j<=n;j++){
                //condition
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
