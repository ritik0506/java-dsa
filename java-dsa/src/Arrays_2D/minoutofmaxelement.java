package Arrays_2D;

import java.util.Scanner;

public class minoutofmaxelement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int x = sc.nextInt();
        System.out.println("enter the columns");
        int y = sc.nextInt();
        int[][] arr = new int[x][y];
        System.out.println("enter the array");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int min=arr[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                int max = arr[i][0];
                if(max<arr[i][j]){
                   max= arr[i][j];
                }
                if(min>max){
                    min=max;
                }
            }
        }
        System.out.println(min);
    }
}
