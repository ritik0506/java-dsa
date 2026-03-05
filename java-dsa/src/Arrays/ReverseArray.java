package Arrays;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int x=0;
        int y= arr.length-1;
        while (x!=y){
            int num = arr[x];
            arr[x] = arr[y];
            arr[y] = num;
            x++;
            y--;
        }

            for (int i=0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

}
