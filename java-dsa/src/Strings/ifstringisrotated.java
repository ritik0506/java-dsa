package Strings;

import java.util.Scanner;

public class ifstringisrotated {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string1");
        String s1 = sc.nextLine();
        System.out.println("enter the string2");
        String s2 = sc.nextLine();
        int n = s1.length();
        char[] arr = s1.toCharArray();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            char first = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;

            String rotated = new String(arr);
            System.out.println("Rotation " + (i+1) + ": " + rotated);

            if (s2.equals(rotated)) {
                System.out.println("true");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("false");
        }
    }
}
