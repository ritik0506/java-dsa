package Arrays;

import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        System.out.println("enter the array");
        int[] arr=new int[n];
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the target value");
        int target= sc.nextInt();
        for(int i=0;i< (arr.length)-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Found location " + i + ", " + j);
                }
            }
        }
    }
}
