package Arrays_2D;

import java.util.Scanner;

public class foreachloop {
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
//        int[][] arr1 = {{6,2,7,4},{2,5,4,8},{3,8,1,6}};
//        for(int i=0;i< arr.length;i++){
//            for(int ele: arr[i]){
//                System.out.print(ele);
//            }
//            System.out.println();
//        }
        for(int [] a: arr){
            for(int ele: a){
                System.out.print(ele);
            }
            System.out.println();
        }
    }
}
