package Arrays_2D;

import java.util.Scanner;

public class rowwithmaxsum {
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
        int max=0;
        int idx=-1;
        for (int i = 0; i < x; i++) {
            int sum = 0;
            for (int j = 0; j < y; j++) {
                sum += arr[i][j];
                if(max<sum){
                    max=sum;
                    idx=i;
                }
            }
            System.out.println(sum);
        }
        System.out.println(max+" , "+idx);
    }
}
