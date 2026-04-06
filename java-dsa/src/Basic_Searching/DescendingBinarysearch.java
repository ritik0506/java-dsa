package Basic_Searching;

import java.util.Scanner;

public class DescendingBinarysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the array In Descending order");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("enter the target");
        int target= sc.nextInt();
        int low=0;
        int high= n-1;
        int idx=-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]<target){
                high=mid-1;
            }else if (arr[mid]>target) {
                low=mid+1;
            }else{
                idx=mid;
                break;
            }
        }
        if(idx!=-1){
            System.out.println("found at index"+idx);
        }else {
            System.out.println("not found");
        }
    }
}
