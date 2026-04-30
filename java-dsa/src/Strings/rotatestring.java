package Strings;

import java.util.Scanner;

public class rotatestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s= sc.nextLine();
        int n= s.length();
        int d=3;
        char[] arr = s.toCharArray();
        for(int i=0;i<d;i++){
            char ch= arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]= arr[j+1];
            }
            arr[n-1]=ch;
        }
        System.out.println(arr);

    }
}
