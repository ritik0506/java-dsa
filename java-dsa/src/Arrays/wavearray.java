package Arrays;

import java.util.Scanner;

public class wavearray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array in Ascending order");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=i+1;
        while(j<n){
            if(j%2==1){
                int temp=arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
            i++;
            j++;
        }
        for(int ele: arr){
            System.out.println(ele);
        }
    }
}
