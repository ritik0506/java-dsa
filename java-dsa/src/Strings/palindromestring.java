package Strings;

import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        int x = 0, y = s.length() - 1;
        boolean isPalindrome = true;

        while (x < y) {
            if (s.charAt(x) != s.charAt(y)) {
                isPalindrome = false;
                break;
            }
            x++;
            y--;
        }

        if (isPalindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}