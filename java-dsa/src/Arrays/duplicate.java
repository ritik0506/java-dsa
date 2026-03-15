package Arrays;

import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<n&&j>0){
            if(a[i]==a[j]){
                System.out.println(a[i]+" is duplicate");
                break;
            }else{
                i++;
                j--;
            }

        }
    }
}