package Arrays;

import java.util.Scanner;

public class addingone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter teh Size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("increment by one ");
        int j = arr.length - 1;
        if (arr[j] != 9) {
            arr[j] += 1;
        } else {
            for (int i = j; i >= 0; i--) {
                if (arr[i] == 9) {
                    arr[i] = 0;
                } else {
                    arr[i]++;
                    break;
                }
            }
        }

        for (int ele : arr) {
                System.out.println(ele);
            }
        }
    }


