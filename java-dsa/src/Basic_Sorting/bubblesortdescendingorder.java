package Basic_Sorting;


import java.util.Scanner;

public class bubblesortdescendingorder {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter teh Size of the array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter the array");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for(int i=0;i<arr.length-1;i++){
                int swap=0;
                for(int j= arr.length-1;j<=0; j--){
                    if (arr[j] < arr[j-1]) {
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                        swap++;
                    }
                }
                if(swap==0) break;
            }
            for(int ele: arr){
                System.out.println(ele);
            }
        }
    }

