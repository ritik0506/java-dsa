package Arrays;

import java.util.Scanner;

public class matrixinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of Rows");
        int row= sc.nextInt();
        System.out.println("enter the no of columns");
        int col= sc.nextInt();
        int [][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0; j<col;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
