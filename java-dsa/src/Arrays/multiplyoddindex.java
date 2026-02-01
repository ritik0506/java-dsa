package Arrays;

import java.util.Scanner;

public class multiplyoddindex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n= sc.nextInt();
        System.out.println("enter the array");
        int []arr=new int[n];
        for (int i=0; i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        for(int j=0;j< arr.length;j++){
            if(j%2==0){
                arr[j]=arr[j]+10;
            }else{
                arr[j]=arr[j]*2;
            }
        }
        for(int k=0;k< arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
