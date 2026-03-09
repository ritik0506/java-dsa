package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Segregates0sand1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter teh array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count0=0;
        int count1=0;
        for (int i=0;i< arr.length;i++) {
            if (arr[i] == 0) {
                count0++;
            }else{
                count1++;
            }
        }
        System.out.println(count1+" "+ count0);
//        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i<count0){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
        }
        for(int m: arr){
            System.out.println(m);
        }
    }
}