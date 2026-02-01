package Arrays;

import java.util.Scanner;

public class printnegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the lenght of the array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter Array elements");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("negative value into array");
        for(int j=0;j<n;j++){
            if(arr[j]<0){
                System.out.println(arr[j]);
            }
        }
    }
}
