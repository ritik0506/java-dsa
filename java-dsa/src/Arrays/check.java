package Arrays;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {

        int[] arr={2,3,0,0,4,0,6,0};
        int n= arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0) {
                if (i != j) {
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;

            }
        }
        for(int ele: arr){
            System.out.println(ele);
        }
    }
}
