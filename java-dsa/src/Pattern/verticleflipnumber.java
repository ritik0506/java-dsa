package Pattern;

import java.util.Scanner;

public class verticleflipnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the umber");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            //this loop for right angle triangle
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // vertical flipped
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
