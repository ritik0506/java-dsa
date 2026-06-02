package Recursion;

public class existinarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n= arr.length-1;
        int x=4;
        exist(arr,n,x);
    }
    public static void exist(int[] arr, int n, int x){
        if(arr[n]==x){
            System.out.println("element at index:- "+n);
            return ;
        }
        exist(arr,n-1,x);
    }
}
