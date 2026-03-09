package Arrays;

import java.util.Scanner;

public class Segregates0sand1soptimized {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter teh array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j= arr.length-1;
        while(i<j) {
            if (arr[i] == 0) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            if(i>j) break;
            if (arr[j] == 1 ) {
                j--;
            } else {
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i] = temp;
                j--;
            }
        }
        for (int ele : arr){
            System.out.println(ele);
        }
    }
}