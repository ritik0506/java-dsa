package Basic_Sorting;

import java.util.Scanner;

public class zerotoend {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter teh Size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int [] arr1= new int[n];
            int x=0;
            int y= arr.length-1;
            int i=0;
            while(i< arr.length){
                if(arr[i]!=0){
                    arr1[x]=arr[i];
                    x++;
                }else {
                    arr1[y]=0;
                    y--;
                }
                i++;
            }
            for(int ele: arr1){
                System.out.println(ele);
            }
            }

        }