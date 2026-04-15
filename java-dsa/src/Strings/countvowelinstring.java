package Strings;

import java.util.Scanner;

public class countvowelinstring {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String s= sc.nextLine();
        String vowel="aeiou";
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0; j< vowel.length();j++){
                if(s.charAt(i)==vowel.charAt(j)) count++;
            }
        }
        System.out.println(count);
    }
}
