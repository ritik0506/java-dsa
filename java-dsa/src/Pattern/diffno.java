package Pattern;

import java.util.Scanner;

public class diffno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                //iteraate the i
                //j will be 1 to n
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
