package Strings;

import java.util.Scanner;

public class containzeroandone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            boolean has0 = false, has1 = false, has2 = false;

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (c == '0') has0 = true;
                if (c == '1') has1 = true;
                if (c == '2') has2 = true;

                // if substring has all three
                if (has0 && has1 && has2) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // stop expanding further
                }
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("-1"); // not found
        } else {
            System.out.println(minLen); // smallest length
        }
    }
}
