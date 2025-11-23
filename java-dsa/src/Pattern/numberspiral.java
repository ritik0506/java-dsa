package Pattern;

import java.util.Scanner;

public class numberspiral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int x=n-1;
        for (int i=1;i<=n;i++){
            //increment
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            //pyrimid
            for (int k=1;k<=2*x-1;k++){
                System.out.print(i);
            }
            x--;
            //decerement
            for (int l=i;l>=1;l--){
                if (l==n)
                    continue;
                else System.out.print(l);
            }
            System.out.println();
        }
        int y=n;
        int z=n;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print(y);
            }
            y--;
            for (int l=z-1;l>=1;l--){
                System.out.print(l);
            }
            z--;
            System.out.println();
        }
    }
}
