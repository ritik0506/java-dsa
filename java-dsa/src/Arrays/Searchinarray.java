package Arrays;

import java.util.Scanner;

public class Searchinarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        System.out.println("enter the array");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the no to be Searched");
        int x= sc.nextInt();
        for(int j=0;j< arr.length;j++){
            if(x==arr[j]){
                System.out.println(" Found at location "+ j);
                break;
            }
        }
    }
}
