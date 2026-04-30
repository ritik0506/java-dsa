package Arrays;

import java.util.Scanner;

public class tryyy {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= 6;
        int[] arr1= new int[n];
        for(int i=0;i<n;i++){
            arr1[i]= sc.nextInt();
        }
        for(int ele: arr1){
            System.out.println(ele);
        }

    }
}
