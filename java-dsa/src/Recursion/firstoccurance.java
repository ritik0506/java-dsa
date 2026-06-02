package Recursion;

public class firstoccurance {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,5,6};
        System.out.println (fist(arr,5,0,arr.length-1));
    }
    public static int fist(int[] arr,int target,int low, int high){
        int mid=(low+high)/2;
        if(low>high) return -1;
        if(arr[mid]==target) {
            int left = fist(arr, target, low, mid - 1);
            return (left != -1) ? left : mid;
        }else if (target>mid) {
            return fist(arr,target,mid+1,high);
        }else {
            return fist(arr, target, low, mid - 1);
        }
    }
}
