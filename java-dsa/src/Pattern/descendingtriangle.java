package Pattern;

import java.util.Scanner;

public class descendingtriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        //rows
        for (int i=n;i>0;i--){
            //column
            for(int j=i;j>0;j--){
                //or j<=n+1-i
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
