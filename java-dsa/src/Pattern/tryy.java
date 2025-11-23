package Pattern;

import java.util.Scanner;

public class tryy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int x=n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(Math.min(i,j));
            }
            System.out.println();
        }
    }
}
