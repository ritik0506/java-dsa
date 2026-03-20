package Basic_Sorting;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length-1;i++){
            int min=arr[i];
            int x=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    x=j;
                }
            }
            int temp= arr[i];
            arr[i]=min;
            arr[x]=temp;
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}
