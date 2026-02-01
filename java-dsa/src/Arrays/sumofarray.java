package Arrays;

import java.util.Scanner;

public class sumofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Size of an array");
        int n= sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int j=0;j<n;j++){
            sum+=arr[j];
        }
        System.out.println("additionn =" +sum);
    }
}
