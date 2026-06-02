package Recursion;

public class reverseofarray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int i=0,j= arr.length-1;
        rev(arr,i,j);
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
    public static void rev(int[] arr,int i,int j){
        if(i>=j) return;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        rev(arr,i+1,j-1);
    }
}
