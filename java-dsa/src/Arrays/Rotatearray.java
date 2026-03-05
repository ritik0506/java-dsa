package Arrays;

import java.util.Scanner;

public class Rotatearray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter the array");
        for(int i=0; i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the no of rotation");
        int x= sc.nextInt();
        int[] arr1= new int[n];

//        int k=0;
//
//        // copy second part
//        for(int i=x;i<n;i++){
//            arr1[k]=arr[i];
//            k++;
//        }
//
//        // copy first part
//        for(int i=0;i<x;i++){
//            arr1[k]=arr[i];
//            k++;
//        }

        for (int i=0 ; i< arr.length;i++) {
            arr1[i] = arr[(i + x) % n];
        }

        for (int i=0;i< arr.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
