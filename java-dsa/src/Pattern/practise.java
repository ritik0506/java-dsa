package Pattern;

import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vlaue of x");
        int x = sc.nextInt();
        for (int i = 0; i <= x; i++) {
            for (int k = 1; k <= x - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
        }
        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}