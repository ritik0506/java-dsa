package Recursion;

public class Recursioninarrays {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8};
        int n= arr.length-1;
        print(arr,n);
    }
    public static void print(int[] arr,int n){
        if(n<0) return;
        print(arr,n-1);
        System.out.println(arr[n]);
    }
}
