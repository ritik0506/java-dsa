package Arrays;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the array");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(secmax<arr[i] && arr[i]!=max){
                secmax=arr[i];
            }
        }
        System.out.println(secmax);
    }
}
