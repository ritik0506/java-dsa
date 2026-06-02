package Recursion;

public class Binarysearch {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7};
        int low=0,high= arr.length;
        int mid=(high+low)/2;
        System.out.println(search(arr,7,mid,low,high));

    }
    public static int search(int[]arr,int target,int mid,int low,int high){
        if(low>high) return -1;
        if(arr[mid]==target) return mid ;
        if(target>mid) low=mid+1;
        else high=mid-1;
       return search(arr,target,(low+high)/2,low,high);
    }
}
