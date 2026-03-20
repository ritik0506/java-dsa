package Basic_Searching;

import java.util.Scanner;

public class binarysearch {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the size of the array");
            int n= sc.nextInt();
            int[] arr= new int[n];
            System.out.println("enter the sorted array");
            for(int i=0; i< arr.length;i++){
                arr[i]= sc.nextInt();
            }
            System.out.println("enter the target ");
            int target= sc.nextInt();
            int low =0;
            int high = n-1;
            boolean flag= false;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]>target){
                    high=mid-1;
                }else if (arr[mid]<target) {
                    low=mid+1;
                }else {
                    System.out.println("Found");
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("Not Found Try another");
            }
        }
    }

