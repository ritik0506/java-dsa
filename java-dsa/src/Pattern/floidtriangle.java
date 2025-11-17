package Pattern;

import java.util.Scanner;

public class floidtriangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        //iteration for the forms
        int k=1;
        //row
        for (int i=1;i<=n;i++){
            //column
            for (int j=1;j<=i;j++){
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
