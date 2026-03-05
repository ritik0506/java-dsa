package Arrays;

import java.util.Scanner;


public class Rotateaarrayoptimized {

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the array");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter teh rotation ");
            int d = sc.nextInt();
            d = d % n;
            reverse(arr, 0, d - 1);
            reverse(arr, d, n - 1);
            reverse(arr, 0, n - 1);

            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
        }

    }

