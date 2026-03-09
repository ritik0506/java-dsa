package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class missingno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n= sc.nextInt();
        int[]arr=new int[n];
        int x= arr.length+1;
        System.out.println("enter teh array");
        for (int i=0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
       int totalsum= x*(x+1)/2;
       int actualsum=0;
       for(int ele : arr) {
           actualsum += ele;
       }
        System.out.println(totalsum+","+actualsum);
       int missing=totalsum-actualsum;
        System.out.println("missing no is "+ missing);
        for (int m: arr){
            System.out.println(m);
        }
    }
}
