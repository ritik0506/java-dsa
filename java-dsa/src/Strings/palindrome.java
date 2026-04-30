package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String src= sc.nextLine();
//        String rev= "";
//        for(int i=src.length()-1;i>=0;i--){
//            rev += src.charAt(i);
//        }
//        if(src.equals(rev)) System.out.println("palindrome");
//        else System.out.println("not palindrome");
//        StringBuilder sb=new StringBuilder(src);
//        String rev= sb.reverse().toString();
//        if(src.equals(rev)) System.out.println("palindrome");
//        else System.out.println("not palindrome");
        char[] arr = src.toCharArray(); // convert String to char array
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String reversed = new String(arr);
        System.out.println(reversed);
    }
}
