package Arrays_2D;

import java.util.Scanner;

public class printcolumnwise {
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
        for(int i=0;i< arr[0].length;i++){
            for(int j= 0;j< arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
