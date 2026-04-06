package Basic_Searching;

import java.util.Scanner;

public class firstoccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the sorted array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int idx = -1;  // store first occurrence index

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                // Found target, but keep searching on the left side
                idx = mid;
                high = mid - 1;
            }
        }

        if (idx != -1) {
            System.out.println("First occurrence found at index: " + idx);
        } else {
            System.out.println("Not Found. Try another.");
        }
    }
}