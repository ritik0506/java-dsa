package Arrays;

import java.util.Scanner;

public class productofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for (int j = 0; j < n; j++) {
            product *= arr[j];
        }
        System.out.println("product = " + product);
    }
}
